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
public class EtablissementEntity {
   private int id_etablissement;
  private String nom_etab;
  private String sigle_etab;
  private String code_postal_etab;
  private String ville_etab;
  private String pays_etab;
  private int fk_id_region_etab;

    public int getId_etablissement() {
        return id_etablissement;
    }

    public String getNom_etab() {
        return nom_etab;
    }

    public String getSigle_etab() {
        return sigle_etab;
    }

    public String getCode_postal_etab() {
        return code_postal_etab;
    }

    public String getVille_etab() {
        return ville_etab;
    }

    public String getPays_etab() {
        return pays_etab;
    }

    public int getFk_id_region_etab() {
        return fk_id_region_etab;
    }

    public void setId_etablissement(int id_etablissement) {
        this.id_etablissement = id_etablissement;
    }

    public void setNom_etab(String nom_etab) {
        this.nom_etab = nom_etab;
    }

    public void setSigle_etab(String sigle_etab) {
        this.sigle_etab = sigle_etab;
    }

    public void setCode_postal_etab(String code_postal_etab) {
        this.code_postal_etab = code_postal_etab;
    }

    public void setVille_etab(String ville_etab) {
        this.ville_etab = ville_etab;
    }

    public void setPays_etab(String pays_etab) {
        this.pays_etab = pays_etab;
    }

    public void setFk_id_region_etab(int fk_id_region_etab) {
        this.fk_id_region_etab = fk_id_region_etab;
    }

    public EtablissementEntity(String nom_etab, String sigle_etab, String code_postal_etab, String ville_etab, String pays_etab, int fk_id_region_etab) {
        this.nom_etab = nom_etab;
        this.sigle_etab = sigle_etab;
        this.code_postal_etab = code_postal_etab;
        this.ville_etab = ville_etab;
        this.pays_etab = pays_etab;
        this.fk_id_region_etab = fk_id_region_etab;
    }

    public EtablissementEntity(int id_etablissement, String nom_etab, String sigle_etab, String code_postal_etab, String ville_etab, String pays_etab, int fk_id_region_etab) {
        this.id_etablissement = id_etablissement;
        this.nom_etab = nom_etab;
        this.sigle_etab = sigle_etab;
        this.code_postal_etab = code_postal_etab;
        this.ville_etab = ville_etab;
        this.pays_etab = pays_etab;
        this.fk_id_region_etab = fk_id_region_etab;
    }
  
}
