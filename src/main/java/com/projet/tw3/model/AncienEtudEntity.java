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
public class AncienEtudEntity {
    private int id_etud;
	private String nom;
	private String prenom;
	private String mail;
	private Date promotion;

    public AncienEtudEntity() {
        super();
    }

    public AncienEtudEntity(String nom, String prenom, String mail, Date promotion, String specialite, String cursus, int id_moyenne) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.promotion = promotion;
        this.specialite = specialite;
        this.cursus = cursus;
        this.id_moyenne = id_moyenne;
    }

    public void setId_etud(int id_etud) {
        this.id_etud = id_etud;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPromotion(Date promotion) {
        this.promotion = promotion;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setCursus(String cursus) {
        this.cursus = cursus;
    }

    public void setId_moyenne(int id_moyenne) {
        this.id_moyenne = id_moyenne;
    }

    public int getId_etud() {
        return id_etud;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public Date getPromotion() {
        return promotion;
    }

    public String getSpecialite() {
        return specialite;
    }

    public String getCursus() {
        return cursus;
    }

    public int getId_moyenne() {
        return id_moyenne;
    }
	private String specialite;
	private String cursus ;
	private int id_moyenne;
}
