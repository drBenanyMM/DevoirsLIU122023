from django.shortcuts import render

# Create your views here.
def product_list(request):
    return render(request, 'produit/product_list.html')

    def product_create(request):
    return render(request, 'produit/product_craeate.html')

    def product_update(request):
    return render(request, 'produit/product_update.html')

    def product_delete(request):
    return render(request, 'produit/product_index.html')