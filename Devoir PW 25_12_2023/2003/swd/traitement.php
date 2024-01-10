
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $matricule = $_POST["matricule"];
    $nom = $_POST["nom"];
    $prenom = $_POST["prenom"];
    $email = $_POST["email"];
    $filiere = $_POST["filiere"];
    $message = "Matricule: $matricule\nNom: $nom\nPrenom: $prenom\nemail: $email\nFiliere: $filiere\n";
 
    $file = fopen(EtudiantsCSCI410.txt)
    fwrite($file, $message . "\n");
    fclose($file);
   
}





