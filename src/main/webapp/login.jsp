<%-- 
    Document   : login
    Created on : 10 mai 2018, 12:11:21
    Author     : xamey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.3.1/dist/leaflet.css"
              integrity="sha512-Rksm5RenBEKSKFjgI3a41vrjkw4EVPlJ3+OiI65vTjIdo9brlAacEuKOiQ5OFh7cOI1bkDwLqdLw3Zg0cRJAAQ=="
              crossorigin=""/>
        <link rel="stylesheet" href="test.css"/>
        <!-- Make sure you put this AFTER Leaflet's CSS -->
        <script src="https://unpkg.com/leaflet@1.3.1/dist/leaflet.js"
                integrity="sha512-/Nsx9X4HebavoBvEBuyp3I7od5tA0UzAxs+j83KgC8PU0kgB4XiK4Lfe4y4cgBtaRJQEIFCW+oC506aPT2L1zw=="
                crossorigin="">
        </script>

        <script src='https://api.mapbox.com/mapbox-gl-js/v0.44.1/mapbox-gl.js'></script>
        <link href='https://api.mapbox.com/mapbox-gl-js/v0.44.1/mapbox-gl.css' rel='stylesheet' />


        <link rel="stylesheet" type="text/css" href="semantic/semantic.min.css">
        <script
            src="https://code.jquery.com/jquery-3.1.1.min.js"
            integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
        crossorigin="anonymous"></script>
        <script src="semantic/semantic.min.js"></script>
        <script src="https://d3js.org/d3.v5.min.js"></script>

        <title>Ancien étudiant</title>

    </head>

    <body class="Site">
        <main class="site-content">
            <div class="ui center aligned header">
                <button class="ui facebook button">
                    <i class="facebook icon"></i>
                    Facebook
                </button>
                <button class="ui linkedin button">
                    <i class="linkedin icon"></i>
                    LinkedIn
                </button>
                <button class="ui facebook button"><i class="graduation cap icon"></i>Univ. Champollion</button>
            </div>
            <div class="ui middle aligned center aligned grid">

                <div class="six wide column">
                    <a href="recherche.html"><img class="ui centered small rounded image" src="img/LOGO_CHAMPOLLION.png"></a>
                </div>
                <div class="ten wide column">

                    <h1>Connexion à votre espace ancien étudiant</h1>

                </div>

            </div>


            <div id="sub-header" class="ui middle aligned center aligned grid">
                <div class="sixteen wide column">

                </div>
            </div>
            <div id="page-ancien" class="ui 	container">

                <form class="ui form" id="loginform">
                    <div class="field">
                        <label>Veuillez rentrer vos identifiants</label>
                        <input type="text" name="id" placeholder="login">
                        <input type="text" name="password" placeholder="pass">
                    </div>

                    <button class="ui primary button" type="submit">Valider</button>
                </form>
            </div>
        </main>
        <div class="ui grid">
            <div class="sixteen wide column">
            </div>
        </div>
        <div id="footer" class="ui stackable three column grid">
            <div class="ui middle aligned center aligned column">
                <button class="ui inverted button"><a href="connect.html">Connexion administrateur</a></button>

            </div>
            <div class="ui middle aligned center aligned column">
                <i class="copyright icon"></i>2018 - Pour toute question, s'adresser à l'Université Jean-François Champollion
            </div>
            <div class="ui middle aligned center aligned column">
                Site réalisé par les étudiants de la Licence 3 Informatique

            </div>
        </div>
        <script>
                    function validateForm(event)
                    {
                        var regex = /^[0-9]+$/;
                        event.preventDefault();
                        //on vérifie que le champ user n'est pas vide
                        if (document.loginform.loginParam.value === "")
                        {
                            alert("Veuillez indiquer un nom d'utilisateur");
                            return false;
                            //on vérifie que les données rentrées dans le champ password est bien un nombre
                        } else if (!((document.loginform.passwordParam.value).match(regex))) {
                            alert("Le mot de passe doit être un nombre");
                            return false;
                            //si tout est vérifié, on envoie le submit
                        } else {
                            document.loginform.submit();
                        }
                    }
        </script>
    </body>
</html> 