<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $matricule = $_POST["matricule"];
    $nom = $_POST["nom"];
    $prenom = $_POST["prenom"];
    $email = $_POST["email"];
    $filiere = $_POST["filiere"];

    // Création de la chaîne de données
    $data = "Matricule: $matricule, Nom: $nom, Prénom: $prenom, Email: $email, Filière: $filiere\n";

    // Sauvegarder les données dans un fichier
    $file = fopen("EtudiantsCSCI410.txt", "a");
    fwrite($file, $data);
    fclose($file);

    // Afficher un message de confirmation
    echo "Inscription réussie ! Merci, $prenom $nom, pour votre inscription à l'Université Libanaise.";
}
?>
