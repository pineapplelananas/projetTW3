--Requettes SQL 

--Nombre de formation en occitanie
SELECT COUNT(intitule_form) FROM formation INNER JOIN etablissement ON formation.fk_id_etablissement_form=etablissement.id_etablissement WHERE etablissement.fk_id_region_etab='FR-OCC' LIMIT 100; 
--Nombre de formation par région
SELECT region.nom_region,COUNT(formation.intitule_form) as nbFormation FROM  etablissement, formation, region WHERE etablissement.fk_id_region_etab=region.id_region AND formation.fk_id_etablissement_form=etablissement.id_etablissement GROUP BY region.nom_region; 


--Nombre d'étudiant par formation
SELECT formation.intitule_form,COUNT(nom_etud) as nbEtud FROM ancien_etudiant, a_effectue, formation WHERE a_effectue.fk_id_etud=ancien_etudiant.id_etud and a_effectue.fk_id_formation=formation.id_formation GROUP BY formation.intitule_form; 

--Nombre d'étudiant dans l'occitanie
SELECT COUNT(nom_etud) FROM ancien_etudiant, etablissement, a_effectue, formation WHERE etablissement.fk_id_region_etab='FR-OCC' AND formation.fk_id_etablissement_form=etablissement.id_etablissement AND a_effectue.fk_id_etud=ancien_etudiant.id_etud and a_effectue.fk_id_formation=formation.id_formation; 
--Nombre d'étudiant par région
SELECT region.nom_region,COUNT(nom_etud) as nbEtud FROM ancien_etudiant, etablissement, a_effectue, formation, region WHERE etablissement.fk_id_region_etab=region.id_region AND formation.fk_id_etablissement_form=etablissement.id_etablissement AND a_effectue.fk_id_etud=ancien_etudiant.id_etud and a_effectue.fk_id_formation=formation.id_formation GROUP BY region.nom_region; 
