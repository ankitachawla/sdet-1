def_init_(self, manufacturer, model, make,transmission, color):
self.manufacturer = manufacturer
self.model = model 
self.make = make
self.transmission = transmission
self.color = color

def accelerate(self):
    print(self.manufscturer + " "+self.model + "has started moving")
def stop(self):
    print(self.manufscturer + " "+self.model + "has stopped moving")

car1 =Car("Toyota","Corolla","2015","Manual","White")
car2 =Car("Maruti","800","2018","Manual","Red")
car3 =Car("Suzuki","CorSwiftolla","2020","Manual","Pink")

car1.accelerate()
car1.stop()