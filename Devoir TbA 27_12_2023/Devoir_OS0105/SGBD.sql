-- creation de la BDD
create database GestionHospital;
-- utilisation de la BDD
use GestionHospital;

-- creation des tables
CREATE TABLE Medicament(
   Code VARCHAR(50),
   Nom VARCHAR(50),
   Dosage VARCHAR(50),
   Prix_parmite INT,
   Stock_disponible VARCHAR(50),
   PRIMARY KEY(Code)
);

CREATE TABLE Patient(
   Id_Patient INT,
   Nom VARCHAR(50),
   Prenom VARCHAR(50),
   Adresse VARCHAR(50),
   NumTel INT,
   PRIMARY KEY(Id_Patient)
);

CREATE TABLE Vente(
   Numero_trans INT,
   Montant_Total INT,
   _date DATE,
   Code VARCHAR(50),
   PRIMARY KEY(Numero_trans),
   FOREIGN KEY(Code) REFERENCES Medicament(Code)
);

CREATE TABLE Medecin(
   Id INT,
   Nom VARCHAR(50),
   Prenom VARCHAR(50),
   Specialite VARCHAR(50),
   Id_Patient INT NOT NULL,
   Code VARCHAR(50) NOT NULL,
   PRIMARY KEY(Id),
   FOREIGN KEY(Id_Patient) REFERENCES Patient(Id_Patient),
   FOREIGN KEY(Code) REFERENCES Medicament(Code)
);

CREATE TABLE Pharmacie(
   Nom_Parma VARCHAR(50),
   Emplacement VARCHAR(50),
   Numero_trans INT NOT NULL,
   Code VARCHAR(50) NOT NULL,
   PRIMARY KEY(Nom_Parma),
   UNIQUE(Numero_trans),
   FOREIGN KEY(Numero_trans) REFERENCES Vente(Numero_trans),
   FOREIGN KEY(Code) REFERENCES Medicament(Code)
);
