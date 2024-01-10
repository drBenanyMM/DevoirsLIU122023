<?php

/* Traitement PHP pour les données du formulaire*/
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $matricule = $_POST["matricule"];
    $nom = $_POST["nom"];
    $prenom = $_POST["prenom"];
    $email = $_POST["email"];
    $filiere = $_POST["filiere"];

    /* Traitement des données*/
    $message = "Inscription réussie:<br>Matricule: $matricule<br>Nom: $nom<br>Prénom: $prenom<br>Email: $email<br>Filière: $filiere";

    /* Affichage du message de confirmation*/
    echo $message;

    /* Sauvegarde des données dans un fichier*/
    $data = "$matricule, $nom, $prenom, $email, $filiere<br>";
    file_put_contents("Etudiants.txt", $data, FILE_APPEND);
}
?>
