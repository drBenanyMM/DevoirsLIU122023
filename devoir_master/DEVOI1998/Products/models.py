from django.db import models

class Personne(models.Model):
    name = models.CharField(max_length=100)
    price = models.DecimalField()
    description= models.CharField(max_length=100)
    def __str__(self):
        return self.name
