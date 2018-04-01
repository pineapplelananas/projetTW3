/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.tw3.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author floriandenise
 */
public class DAO {
    private final DataSource myDataSource;

    /**
     * Construit le DAO avec sa source de données
     *
     * @param dataSource la source de données à utiliser
     */
    public DAO(DataSource dataSource) {
        this.myDataSource = dataSource;
    }
public void addEtab(String _nom_etab,String _sigle_etab,String _code_postal_etab,String _ville_etab,String _pays_etab,int _fk_id_region) throws DAOException {
        String sql = "INSERT INTO etablissement VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = myDataSource.getConnection(); // Ouvrir une connexion
                PreparedStatement stmt = connection.prepareStatement(sql);) {

            String nom_etab = _nom_etab;
            String sigle_etab = _sigle_etab;
            String code_postal_etab = _code_postal_etab;
            String ville_etab = _ville_etab;
            String pays_etab = _pays_etab;
            int fk_id_region = _fk_id_region;


            stmt.setString(1, nom_etab);
            stmt.setString(2, sigle_etab);
            stmt.setString(3, code_postal_etab);
            stmt.setString(4, ville_etab);
            stmt.setString(5, pays_etab);
            stmt.setInt(6, fk_id_region);

            int rs = stmt.executeUpdate();
            if (rs == 0) {
                throw new DAOException("aucun établissement n'a été ajouté");
            }

        } catch (SQLException ex) {
            Logger.getLogger("DAO").log(Level.SEVERE, null, ex);
            throw new DAOException(ex.getMessage());
        }

    }
 /*
     * Permet de connaître le chiffre d'affaires par catégorie de produit
     * réalisé entre deux certaines dates
     *
     * @param date_debut le début de la période étudiée
     * @param date_fin la fin de la période étudiée
     * @return une liste d'entités Revenue
     * @throws SQLException
     * @throws ParseException
     */
    public List<FormByStateEntity> nbFormByState() throws SQLException, ParseException {

        List<FormByStateEntity> result = new LinkedList<>();

        String sql = "SELECT region.nom_region,COUNT(formation.intitule_form) as nbFormation FROM  etablissement, formation, region WHERE etablissement.fk_id_region_etab=region.id_region AND formation.fk_id_etablissement_form=etablissement.id_etablissement GROUP BY region.nom_region";
                try (Connection connection = myDataSource.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)) {

            //on exécute la requête
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                //on créé une entity Revenue avec chaque ligne du résultat de la requête SQL
                String nom_region = rs.getString("nom_region");
                int nbForm = rs.getInt("nbFormation");
                FormByStateEntity new_section = new FormByStateEntity(nom_region, nbForm);
               //on l'ajoute à la liste de résultats
                result.add(new_section);
            }
        }

        return result;
        //Visualiser les chiffres d'affaire par zone géographique, en choisissant la période 
       //(date de début / date de fin) sur laquelle doit porter la statistique.

        //Visualiser les chiffres d'affaire par client, en choisissant la période 
        //(date de début / date de fin) sur laquelle doit porter la statistique.
    }
}
