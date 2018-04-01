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
public class EntrepriseEntity {
    private int id_entreprise;
  private String nom_ese;
  private String adresse_ese;
  private String secteur_activite_ese;
  private String ville_ese;
  private String code_postal_ese;
  private String pays_ese;
  private String fk_id_region_ese;

    public void setId_entreprise(int id_entreprise) {
        this.id_entreprise = id_entreprise;
    }

    public void setNom_ese(String nom_ese) {
        this.nom_ese = nom_ese;
    }

    public void setAdresse_ese(String adresse_ese) {
        this.adresse_ese = adresse_ese;
    }

    public void setSecteur_activite_ese(String secteur_activite_ese) {
        this.secteur_activite_ese = secteur_activite_ese;
    }

    public void setVille_ese(String ville_ese) {
        this.ville_ese = ville_ese;
    }

    public void setCode_postal_ese(String code_postal_ese) {
        this.code_postal_ese = code_postal_ese;
    }

    public void setPays_ese(String pays_ese) {
        this.pays_ese = pays_ese;
    }

    public void setFk_id_region_ese(String fk_id_region_ese) {
        this.fk_id_region_ese = fk_id_region_ese;
    }

    public int getId_entreprise() {
        return id_entreprise;
    }

    public String getNom_ese() {
        return nom_ese;
    }

    public String getAdresse_ese() {
        return adresse_ese;
    }

    public String getSecteur_activite_ese() {
        return secteur_activite_ese;
    }

    public String getVille_ese() {
        return ville_ese;
    }

    public String getCode_postal_ese() {
        return code_postal_ese;
    }

    public String getPays_ese() {
        return pays_ese;
    }

    public String getFk_id_region_ese() {
        return fk_id_region_ese;
    }

    public EntrepriseEntity(String nom_ese, String adresse_ese, String secteur_activite_ese, String ville_ese, String code_postal_ese, String pays_ese, String fk_id_region_ese) {
        this.nom_ese = nom_ese;
        this.adresse_ese = adresse_ese;
        this.secteur_activite_ese = secteur_activite_ese;
        this.ville_ese = ville_ese;
        this.code_postal_ese = code_postal_ese;
        this.pays_ese = pays_ese;
        this.fk_id_region_ese = fk_id_region_ese;
    }

    public EntrepriseEntity(int id_entreprise, String nom_ese, String adresse_ese, String secteur_activite_ese, String ville_ese, String code_postal_ese, String pays_ese, String fk_id_region_ese) {
        this.id_entreprise = id_entreprise;
        this.nom_ese = nom_ese;
        this.adresse_ese = adresse_ese;
        this.secteur_activite_ese = secteur_activite_ese;
        this.ville_ese = ville_ese;
        this.code_postal_ese = code_postal_ese;
        this.pays_ese = pays_ese;
        this.fk_id_region_ese = fk_id_region_ese;
    }
}
