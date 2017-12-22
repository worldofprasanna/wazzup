from django.urls import include, path
from django.contrib import admin

urlpatterns = [
    path('events/', include('events.urls')),
    path('admin/', admin.site.urls),
]
