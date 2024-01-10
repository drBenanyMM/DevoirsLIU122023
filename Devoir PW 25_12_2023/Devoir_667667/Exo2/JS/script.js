
/* Fichier JavaScript pour la validation du formulaire*/
function validateForm() {
    var matricule = document.getElementById("matricule").value;
    var nom = document.getElementById("nom").value;
    var filiere = document.getElementById("filiere").value;

    /* Validation des champs obligatoires*/
    if (matricule === "" || nom === "" || filiere === "") {
        alert("Veuillez remplir les champs obligatoires: Matricule, Nom, Filière");
        return false;
    }

    return true;
}
