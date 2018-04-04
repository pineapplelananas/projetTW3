SELECT moyenne_l3.mention,COUNT(nom_etud), id_moyenne
FROM moyenne_l3,ancien_etudiant,etablissement,specialite,formation,a_effectue
WHERE 
etablissement.id_etablissement='1' AND specialite.id_specialite='1' AND
ancien_etudiant.fk_id_moyenne_l3_etud=moyenne_l3.id_moyenne AND
ancien_etudiant.fk_id_specialite_etud=specialite.id_specialite AND
formation.fk_id_specialite_form=specialite.id_specialite AND
formation.fk_id_etablissement_form=etablissement.id_etablissement AND
a_effectue.fk_id_formation=formation.id_formation AND
a_effectue.fk_id_etud=ancien_etudiant.id_etud 
GROUP BY moyenne_l3.mention;da