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
public class SpecialiteEntity {
    private int id_specialite;
  private String lib_specialite;

    public SpecialiteEntity(String lib_specialite) {
        this.lib_specialite = lib_specialite;
    }

    public int getId_specialite() {
        return id_specialite;
    }

    public String getLib_specialite() {
        return lib_specialite;
    }

    public void setId_specialite(int id_specialite) {
        this.id_specialite = id_specialite;
    }

    public void setLib_specialite(String lib_specialite) {
        this.lib_specialite = lib_specialite;
    }

    public SpecialiteEntity(int id_specialite, String lib_specialite) {
        this.id_specialite = id_specialite;
        this.lib_specialite = lib_specialite;
    }
    
}
