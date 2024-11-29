from django.db import models
from django.contrib.auth.models import User

class Trip(models.Model):
    user = models.ForeignKey(User, on_delete=models.CASCADE)
    name = models.CharField(max_length=100)
    start_date = models.DateField()
    end_date = models.DateField()

    def __str__(self):
        return self.name

class Destination(models.Model):
    trip = models.ForeignKey(Trip, on_delete=models.CASCADE)
    name = models.CharField(max_length=100)
    arrival_date = models.DateField()
    departure_date = models.DateField()

    def __str__(self):
        return self.name

class Activity(models.Model):
    destination = models.ForeignKey(Destination, on_delete=models.CASCADE)
    name = models.CharField(max_length=100)
    date = models.DateField()
    time = models.TimeField()

    def __str__(self):
        return self.name
