/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.tw3.model;

/**
 *
 * @author floriandenise
 */
public class CursusEntity {
    private int id_cursus;

    public CursusEntity(String lib_cursus) {
        this.lib_cursus = lib_cursus;
    }

    public CursusEntity(int id_cursus, String lib_cursus) {
        this.id_cursus = id_cursus;
        this.lib_cursus = lib_cursus;
    }

    public void setId_cursus(int id_cursus) {
        this.id_cursus = id_cursus;
    }

    public void setLib_cursus(String lib_cursus) {
        this.lib_cursus = lib_cursus;
    }

    public String getLib_cursus() {
        return lib_cursus;
    }

    public int getId_cursus() {
        return id_cursus;
    }
    private String lib_cursus;
}
