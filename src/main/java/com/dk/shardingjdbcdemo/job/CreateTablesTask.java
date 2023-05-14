package com.dk.shardingjdbcdemo.job;

import com.dk.shardingjdbcdemo.vo.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Slf4j
@Component
public class CreateTablesTask {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static DateFormat millisdf = new SimpleDateFormat("yyyyMMddHHmmssSS");

    // @Scheduled(cron = "0/5 * * * * ?")
    public Object createSentinelTable() throws Exception {
        BaseResult result = new BaseResult();
        Connection conn = null;
        ResultSet rs = null;
        try {
            String tableName = "order";
            String ym = getLogID().substring(0, 6);
            String table = tableName.concat("_").concat(ym);
            conn = jdbcTemplate.getDataSource().getConnection();
            rs = conn.getMetaData().getTables(null, null, table, null);
            if (rs.next()) {
                log.info("table is exist!");
            } else {
                String c_sql = "创建表的sql语句";
                jdbcTemplate.execute(c_sql);
                log.info("create table success!");
            }
            result.setSuccess(true);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            result.setSuccess(false);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return result;

    }
    public static String getLogID() {
        return getmillisTime() + ((int) (Math.random() * 1000) + 1000);
    }

    public static String getmillisTime() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MONTH, +1);
        Date m = c.getTime();
        return millisdf.format(m);
    }
}