/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.tw3.model;

import java.sql.Date;

/**
 *
 * @author floriandenise
 */
public class PosteEntity {
      private String intitule_poste;
  private Date debut_poste;
  private Date fin_poste;
  private String description_poste;
  private String specialite_poste;
  private int fk_id_etud_poste;
  private int fk_id_entreprise_poste;

    public void setIntitule_poste(String intitule_poste) {
        this.intitule_poste = intitule_poste;
    }

    public void setDebut_poste(Date debut_poste) {
        this.debut_poste = debut_poste;
    }

    public void setFin_poste(Date fin_poste) {
        this.fin_poste = fin_poste;
    }

    public void setDescription_poste(String description_poste) {
        this.description_poste = description_poste;
    }

    public void setSpecialite_poste(String specialite_poste) {
        this.specialite_poste = specialite_poste;
    }

    public void setFk_id_etud_poste(int fk_id_etud_poste) {
        this.fk_id_etud_poste = fk_id_etud_poste;
    }

    public void setFk_id_entreprise_poste(int fk_id_entreprise_poste) {
        this.fk_id_entreprise_poste = fk_id_entreprise_poste;
    }

    public String getIntitule_poste() {
        return intitule_poste;
    }

    public Date getDebut_poste() {
        return debut_poste;
    }

    public Date getFin_poste() {
        return fin_poste;
    }

    public String getDescription_poste() {
        return description_poste;
    }

    public String getSpecialite_poste() {
        return specialite_poste;
    }

    public int getFk_id_etud_poste() {
        return fk_id_etud_poste;
    }

    public int getFk_id_entreprise_poste() {
        return fk_id_entreprise_poste;
    }

    public PosteEntity(String intitule_poste, Date debut_poste, Date fin_poste, String description_poste, String specialite_poste, int fk_id_etud_poste, int fk_id_entreprise_poste) {
        this.intitule_poste = intitule_poste;
        this.debut_poste = debut_poste;
        this.fin_poste = fin_poste;
        this.description_poste = description_poste;
        this.specialite_poste = specialite_poste;
        this.fk_id_etud_poste = fk_id_etud_poste;
        this.fk_id_entreprise_poste = fk_id_entreprise_poste;
    }
}
