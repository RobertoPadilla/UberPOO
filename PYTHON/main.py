from Car import Car
from Account import Account

if __name__ == "__main__":
  print("Hola Mundo")
  # car = Car()
  # car.license = "AMS234"
  # car.driver = "Andres Herrera"
  # print(vars(car))

  # car2 = Car()
  # car2.license = "DWE342"
  # car2.driver = "Andrea Lopez"
  # print(vars(car2))

  car = Car("AMS234", Account("Andres Herrera", "AND123"))
  print(vars(car))
  print(vars(car.driver))