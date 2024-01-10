  /* 
     django-admin startproject blog 
     python -m django startproject monprojet 
     python manage.py startapp personnes 
     */
     /* 
1. Créer la base de données BddPersonnes.py 
personnes=[ 
 { 
 "nom":"Ahmed", 
 "age":23, 
 "email":"benay@gmail.Com" 
 }] 
2. Importer la dans la vue 
from . Bdd_personnes import personnes 
3. Créer un dictionnaire dans render de la vue 
 return render(request, 'personnes/list.html', context={'personnes':personnes}) 
4. Utiliser le Modèle dans le tempate: Utilisation de Vues 
{% for Personne in personnes %} 
 <H2>{{Personne.nom}}</H2> 
 <P>{{Personne.age}}</P> 
 <SPAN>{{Personne.email}}</SPAN> 
{% endfor %} 


5. fichier models.py 
6. Importer models de Django 
 from django.db import models 
7. Définir le Modèle 

class Personne(models.Model): 
 nom = models.CharField(max_length=100) 
 prenom = models.CharField(max_length=100) 
 date_naissance = models.DateField() 
 email = models.EmailField() 

8. Créer les tables associées dans le SGBD 
python manage.py makemigrations 
python manage.py migrate

9. Utiliser le Modèle dans les Vues : ORM 
def liste_personnes(request): 
 personnes = Personne.objects.all() 
 return render(request, 'personnes/liste_personnes.html', {'personnes': personnes})

 10. Utiliser le Modèle : Utilisation de Vues 
<ul> 
 {% for personne in personnes %} 
 <li>{{ personne.nom }} {{ personne.prenom }} - {{ personne.date_naissance }} - {{ 
personne.email }}</li> 
 {% endfor %} 
</ul> 
       

       5. CRUD avec un model 
Utilisation les fonctionnalités de Django ORM 
1. Lancer la Console Django : python manage.py shell 
2. Importez le Modèle Personne : from app.models import Personne 
3. Insertion de données : 
Insertion 
personne1 = Personne(nom='Med', age=30, email='med@gmail.com') 
personne1.save() 
personne2 = Personne(nom='Mariem', age=25, email='mary@yahoo.com') 
personne2.save() 
selection 
personnes = Personne.objects.all() 
for personne in personnes: 
 print(f"Nom: {personne.nom}, Âge: {personne.age}, Email: {personne.email}") 
4. Fermer la console : exit() 


from app.models import Personne 
# Créer une nouvelle personne 
Moi_personne = Personne(nom='Benany', age=36, email='benany@gmail.com') 
Moi_personne.save() 
insert 
from app.models import Personne 
# Lire toutes les personnes 
personnes = Personne.objects.all() 
# Afficher les informations 
for personne in personnes: 
Select * 
 print(personne) 
from app.models import Personne 
# Lire une personne par ID (remplacez 1 par l'ID réel) 
une_personne = Personne.objects.get(id=1) 
# Afficher les informations 
print(une_personne) 
Select by 
id 
from app.models import Personne 
# Récupérer une personne existante par ID 
personne_maj = Personne.objects.get(id=1) 
# Mettre à jour les champs 
personne_maj.age = 31 
personne_maj.save() 
Update 
from app.models import Personne 
# Récupérer une personne existante par ID (remplacez 1 par l'ID réel) 
personne_a_supprimer = Personne.objects.get(id=1) 
# Supprimer la personne 
personne_a_supprimer.delete() 
Delete 

 les 3ncomposent de l'architechture Web: 

. HTML: HyperText Markup 
Language: Le langage de balisage 
(formatage) du web.
2. URI: Uniform Resource Identifier: 
Une sorte d’adresse qui est unique 
et utilisée pour identifier chaque 
ressource à travers le web. 
Communément aussi appelé un 
URL.
3. HTTP: HyperText Transfer Protocol: 
Permet la récupération de 
ressources liées à travers le Web.

Les Architecture Orientée Services (SOA):

1. SOAP: Protocole 
2. Rest: Architecture

REST SOAP
Signification Representational State Transfer, Simple Object Access Protocol
Style architectural Basé sur le web|| Basé sur les services
Protocole HTTP ||HTTP, SMTP, FTP, etc.
Langage de données JSON, XML, YAML ||XML
Transport de données Via URL et/ou HTTP headers|| Via l'enveloppe SOAP
Offre des protocoles de sécurité 
tels que WS-Security||
Utilise des protocoles standard tels 
que HTTPS et OAuth Sécurité
Performance Plus rapide et plus léger|| Plus lent et plus lourd
Scalabilité Évolutif|| Non évolutif
Gestion d'erreur Utilise les codes d'état HTTP ||Utilise les codes d'erreur SOAP
Exemple de service Twitter API Payment Gateway AP

es catégories principales du web ?
Le web statique (2-tiers) est principalement 
utilisé pour des sites web qui ne nécessitent 
pas de mises à jour régulières et de 
fonctionnalités interactives, tandis que le 

web dynamique (3-tiers) est utilisé pour des 
sites web qui nécessitent une interaction en 
temps réel et des mises à jour fréquentes.

 web 2-tiers (client serveur).
  3-tiers(client ,seveveure,Base de donnee)

  ructure de données de l'application
2. La vue traite les requêtes HTTP entrantes et retourne les 
réponses correspondantes
3. Le Template est la représentation visuelle de l'application

internet: c'est interconnection des machines sur le reseaux avec internel chaque  machine est identifier sur le reseaux par son adress ip

le web: est l'echange de donnee(ressource) sur l'internet.
le web services :permet la communication etre tout les application quelque soi la technologie utilise.

soap protocole de comminication entre les application 
Rest :architechture base sur le protocole ...
htttp et utilise get,post,put,puch,delet comme..
verbe du pttp : get, post ,put, path ,delete
difference entre django framework diango rest:
django framwork: pour le developpement des a[plication 
django rest framework pour le de veloppent des API]
on pe utilise django et django rest dns le memme application
