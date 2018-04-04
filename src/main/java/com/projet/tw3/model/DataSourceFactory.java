/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.tw3.model;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class DataSourceFactory {

    public enum DriverType {
        embedded, server
    };

    // Choic du type de driver : embedded ou serveur
    private static final DriverType TYPE = DriverType.server;

    /**
     * Renvoie la source de données (server ou embbeded)
     *
     * @return la source de données
     */
    public static DataSource getDataSource() {
        DataSource result;

        BasicDataSource ds = new BasicDataSource();

        ds.setDriverClassName("com.mysql.jdbc.Driver");

        ds.setUrl("jdbc:mysql://<host>:<port>/<database>");

        //Set database user
        ds.setUsername("root");

        //Set database password
        ds.setPassword("root");

        result = ds;

        return result;
    }

}
