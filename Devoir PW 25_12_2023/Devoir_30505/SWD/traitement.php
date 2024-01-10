
<?php
$inscription = array("Nom" => "","Matricule" => "","Filiere" => "", "Email" => 0);
$inscription["Nom"]=$_GET["Nom"];
echo ($inscription["Nom"]);
$inscription["Matricule"]=$_GET["Matricule"];
echo ($inscription["Matricule"]);

$inscription["Filiere"]=$_GET["Filiere"];
echo ($inscription["Filiere"]);

$inscription["Email"]=$_GET["Email"];
echo ($inscription["Email"]);

foreach ($inscription as $key => $value) {
    echo $key. ":" .$value. "<br>";
    echo "votre inscription est confirmer"
  }

?>