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
public class StatutEntity {
    private int id_statut;
    private String lib_statut;

    public StatutEntity(int id_statut, String lib_statut) {
        this.id_statut = id_statut;
        this.lib_statut = lib_statut;
    }

    public void setId_statut(int id_statut) {
        this.id_statut = id_statut;
    }

    public void setLib_statut(String lib_statut) {
        this.lib_statut = lib_statut;
    }

    public int getId_statut() {
        return id_statut;
    }

    public String getLib_statut() {
        return lib_statut;
    }

    public StatutEntity(String lib_statut) {
        this.lib_statut = lib_statut;
    }
}
