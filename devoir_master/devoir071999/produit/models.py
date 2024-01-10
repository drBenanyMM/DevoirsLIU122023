from django.db import models

# Create your models here.
class Product(models.Model):
    nom = models.CharField(max_length=50)
    description = models.CharField(max_length=50)
    prise= models.IntegerField(default=0)

    class category(models.Model):
    
