from django.shortcuts import rander




def productCreate_view(request):
    
    return rander(request,"productCreate.html",context={'create':create})

def productDelete_view(request):
    
    return rander(request,"productDelete.html",context={'delete':delete})

def producteUpdate_view(request):
    
    return rander(request,"producteUpdate.html",context={'update':update})

def productListe_view(request):
    
    return rander(request,"productListe.html",context={'liste':liste})

def categorie_view(request):
    
    return rander(request,"categorie.html",context={'categorie':categorie})
def model_view(request):
    
    return rander(request,"model.html",context={'model':model})