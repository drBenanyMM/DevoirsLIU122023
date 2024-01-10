from django.db import models

class Product(models.Model):
    nom = models.CharField(max_length=100)
    prix = models.DecimalField(max_digits=5, decimal_places=2,null=True,blank=True)
    description = models.TextField(null=True,blank=True)

    def __str__(self):
        return self.nom 
# Ceci est les commande de shell 
# python manage.py makemigration
# python manage.py migrate
# python manage.py shell
# >>> from Product.models import Product
# >>> produit1 = Product(nom='voiture',prix=25.25,description='noir')
# >>> produit1.save() 
# pour afficher
    # for produit in produits: 
    #     print(produit) 
# update produit
#     >>> produit1 = Product.objects.get(id=1)      
# >>> produit1.prix = 30.0 
# >>> produit1.save()     
# pour supprimer
    produit1.delete()
