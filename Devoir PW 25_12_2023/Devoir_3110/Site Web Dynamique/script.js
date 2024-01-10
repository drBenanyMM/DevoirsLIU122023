function validateForm() {
    var matricule = document.getElementById("matricule").value;
    var nom = document.getElementById("nom").value;
    var filiere = document.getElementById("filiere").value;

    if (matricule === "" || nom === "" || filiere === "") {
        alert("Veuillez remplir tous les champs obligatoires.");
        return false;
    }

    return true;
}
