from django.contrib import admin
from django.urls import path
from . import views


urlpatterns = [
    path("create", views.view_product_create,name="create"),
    path("delete", views.view_product_delete,name="delete"),
    path("edit", views.view_product_update,name="update"),
    path("list", views.view_product_list,name="list"),	
]
