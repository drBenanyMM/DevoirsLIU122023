from django.shortcuts import render
from . Bdd import Products 

def view_Products(request):
    #return HttpResponse("Test Module Personne")
    personnes = Products.objects.all()
    return render(request, 'Products/list.html', context={'Products': Products})

    