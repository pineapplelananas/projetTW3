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
public class AeffectueEntity {
    private Date debut_formation;

    public AeffectueEntity(Date debut_formation, int fk_id_formation, int fk_id_etud, int fk_statut_id) {
        this.debut_formation = debut_formation;
        this.fk_id_formation = fk_id_formation;
        this.fk_id_etud = fk_id_etud;
        this.fk_statut_id = fk_statut_id;
    }

    public void setDebut_formation(Date debut_formation) {
        this.debut_formation = debut_formation;
    }

    public void setFk_id_formation(int fk_id_formation) {
        this.fk_id_formation = fk_id_formation;
    }

    public void setFk_id_etud(int fk_id_etud) {
        this.fk_id_etud = fk_id_etud;
    }

    public void setFk_statut_id(int fk_statut_id) {
        this.fk_statut_id = fk_statut_id;
    }

    public Date getDebut_formation() {
        return debut_formation;
    }

    public int getFk_id_formation() {
        return fk_id_formation;
    }

    public int getFk_id_etud() {
        return fk_id_etud;
    }

    public int getFk_statut_id() {
        return fk_statut_id;
    }
  private int fk_id_formation;
    private int fk_id_etud;
  private int fk_statut_id; 
}
