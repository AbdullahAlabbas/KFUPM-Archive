class Car:
    def __init__(self, fuelEfficiency: float, initialFuel =0.0):

        self.fuelEfficiency = fuelEfficiency
        self.initialFuel = initialFuel

        print(f"available fuel = {self.initialFuel} liters \n Fuel efficiency = {self.fuelEfficiency} km/liter")

    def drive(self, distance =0.0):
        self.distance = distance
        maxDistance = self.fuelEfficiency * self.initialFuel

        if distance == 0.0 or self.distance > maxDistance:
            return f"The available fuel can drive maximum of {maxDistance: .1f} km"

        else:
            self.initialFuel = self.initialFuel - self.distance / self.fuelEfficiency
            return f"remaining Fuel= {self.initialFuel: .1f} liters"

    def getFuel(self):
        return self.initialFuel

    def addFuel(self, fuel):
        self.initialFuel += fuel

        return self.initialFuel 

    def getFuelEfficiency(self):
        return self.fuelEfficiency

    def setFuelEfficiency(self, fuelEfficiency):
        self.fuelEfficiency = fuelEfficiency
        return self.fuelEfficiency

car = Car(10, 20)

print(car.drive(500))

car.addFuel(30)
car.setFuelEfficiency(20)

print(car.drive(300))


