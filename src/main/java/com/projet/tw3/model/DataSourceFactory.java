/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.tw3.model;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataSourceFactory {

    MysqlDataSource result;

    public MysqlDataSource getSQLDataSource() {
        Properties props = new Properties();

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("properties.properties");

        try {
            props.load(is);
            result = new MysqlDataSource();
            result.setURL(props.getProperty("MYSQL_DB_URL"));
            result.setUser(props.getProperty("MYSQL_DB_USERNAME"));
            result.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;

    
    }
}
