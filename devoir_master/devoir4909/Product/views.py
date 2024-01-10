from django.shortcuts import render
from django.http import HttpResponse

def view_product_list(request):
    return render(request, 'Product/product_list.html')
def view_product_create(request):
    return render(request, 'Product/product_create.html')
def view_product_update(request):
    return render(request, 'Product/product_update.html')
def view_product_delete(request):
    return render(request, 'Product/product_delete.html')
            