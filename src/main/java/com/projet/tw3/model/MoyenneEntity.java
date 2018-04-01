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
public class MoyenneEntity {
    private int id_moyenne;
    private String mention;

    public void setId_moyenne(int id_moyenne) {
        this.id_moyenne = id_moyenne;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public int getId_moyenne() {
        return id_moyenne;
    }

    public String getMention() {
        return mention;
    }

    public MoyenneEntity(String mention) {
        this.mention = mention;
    }

    public MoyenneEntity(int id_moyenne, String mention) {
        this.id_moyenne = id_moyenne;
        this.mention = mention;
    }
}
