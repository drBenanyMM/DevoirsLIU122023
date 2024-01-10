from django.shortcuts import render


from . Bdd import Products

def view_contact(request):
    return render(request, 'contact.html')

def view_accueil(request):
    return render(request, 'index.html', context={'Products':Products})

    
    
    
    #return render(request, 'index.html')

