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
public class FormByStateEntity {
    private String nom_region;
    private int nbFormation;

    public FormByStateEntity(String nom_region, int nb_form) {
        this.nom_region = nom_region;
        this.nbFormation = nb_form;
    }
    
}
