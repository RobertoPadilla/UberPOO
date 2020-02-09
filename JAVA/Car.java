class Car {
  private Integer id;
  private String license;
  private Account driver;
  private Integer passenger;

  // Constructor, cosas con las que sin ellas, el objeto no puede vivir

  public Car(String license, Account driver){//los nombres de variables pueden ser los que queramos y son variables locales
    this.license = license; //this nos permite acceder a todos los atributos de esta clase, por ejemplo, driver.
    this.driver = driver;

  }
  
  void printDataCar() {
    System.out.println("License: " + license + " Driver: " + driver.name);
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Account getDriver() {
    return driver;
  }

  public void setDriver(Account driver) {
    this.driver = driver;
  }

  public Integer getPassenger() {
    return passenger;
  }

  public void setPassenger(Integer passenger) {
    if(passenger == 4){
      this.passenger = passenger;
    }else{
      System.out.println("Necesitas asignar 4 pasajeros");
    }
  }

}