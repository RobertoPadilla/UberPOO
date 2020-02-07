class Car {
  Integer id;
  String license;
  Account driver;
  Integer passenger;

  // Constructor, cosas con las que sin ellas, el objeto no puede vivir

  public Car(String license, Account driver){//los nombres de variables pueden ser los que queramos y son variables locales
    this.license = license; //this nos permite acceder a todos los atributos de esta clase, por ejemplo, driver.
    this.driver = driver;

  }
  void printDataCar() {
    System.out.println("License: " + license + " Driver: " + driver.name);
  }
}