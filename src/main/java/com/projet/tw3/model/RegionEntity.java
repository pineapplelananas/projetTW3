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
public class RegionEntity {
    private String id_region;
    private String nom_region;

    public RegionEntity(String nom_region) {
        this.nom_region = nom_region;
    }

    public void setId_region(String id_region) {
        this.id_region = id_region;
    }

    public void setNom_region(String nom_region) {
        this.nom_region = nom_region;
    }

    public String getId_region() {
        return id_region;
    }

    public String getNom_region() {
        return nom_region;
    }

    public RegionEntity(String id_region, String nom_region) {
        this.id_region = id_region;
        this.nom_region = nom_region;
    }
}
