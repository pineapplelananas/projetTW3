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
public class FormationEntity {
   private int id_formation;
  private String intitule_form;
  private String sigle_form;
  private String type_form;
  private int fk_id_specialite_form;
  private int fk_id_etablissement_form;

    public FormationEntity(String intitule_form, String sigle_form, String type_form, int fk_id_specialite_form, int fk_id_etablissement_form) {
        this.intitule_form = intitule_form;
        this.sigle_form = sigle_form;
        this.type_form = type_form;
        this.fk_id_specialite_form = fk_id_specialite_form;
        this.fk_id_etablissement_form = fk_id_etablissement_form;
    }

    public FormationEntity(int id_formation, String intitule_form, String sigle_form, String type_form, int fk_id_specialite_form, int fk_id_etablissement_form) {
        this.id_formation = id_formation;
        this.intitule_form = intitule_form;
        this.sigle_form = sigle_form;
        this.type_form = type_form;
        this.fk_id_specialite_form = fk_id_specialite_form;
        this.fk_id_etablissement_form = fk_id_etablissement_form;
    }

    public void setId_formation(int id_formation) {
        this.id_formation = id_formation;
    }

    public void setIntitule_form(String intitule_form) {
        this.intitule_form = intitule_form;
    }

    public void setSigle_form(String sigle_form) {
        this.sigle_form = sigle_form;
    }

    public void setType_form(String type_form) {
        this.type_form = type_form;
    }

    public void setFk_id_specialite_form(int fk_id_specialite_form) {
        this.fk_id_specialite_form = fk_id_specialite_form;
    }

    public void setFk_id_etablissement_form(int fk_id_etablissement_form) {
        this.fk_id_etablissement_form = fk_id_etablissement_form;
    }

    public int getId_formation() {
        return id_formation;
    }

    public String getIntitule_form() {
        return intitule_form;
    }

    public String getSigle_form() {
        return sigle_form;
    }

    public String getType_form() {
        return type_form;
    }

    public int getFk_id_specialite_form() {
        return fk_id_specialite_form;
    }

    public int getFk_id_etablissement_form() {
        return fk_id_etablissement_form;
    }
  
}
