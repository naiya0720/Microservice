package com.phn.springboot01.config;

import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.context.annotation.Configuration;

/**
 * @author Penghenan
 * @create 2019-12-17 11:58:24
 */
@Configuration
public class MysqlConfig extends MySQL5Dialect {

    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
