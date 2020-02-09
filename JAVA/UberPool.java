class UberPool extends Car {
  //Atributos propios de la clase Uber Pool
  String brand;
  String model;

  public UberPool(String license, Account driver, String brand, String model){
    super(license, driver); //Instanciamos los atributos de la clase Car
    this.brand = brand;
    this.model = model;
  }
}