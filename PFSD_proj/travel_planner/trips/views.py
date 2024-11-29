from django.shortcuts import render, get_object_or_404
from .models import Trip, Destination, Activity

def trip_list(request):
    trips = Trip.objects.filter(user=request.user)
    return render(request, 'trips/trip_list.html', {'trips': trips})

def trip_detail(request, trip_id):
    trip = get_object_or_404(Trip, id=trip_id, user=request.user)
    destinations = trip.destination_set.all()
    return render(request, 'trips/trip_detail.html', {'trip': trip, 'destinations': destinations})