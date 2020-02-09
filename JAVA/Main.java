class Main {
  public static void main(String[] args) {
    // Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
    // Car car2 = new Car("QWE123", new Account("Andrea Herrera", "ANA123"));

    // car.printDataCar();
    // car2.printDataCar();
    // UberVan uberVan = new UberVan("FGR123", new Account("Andres Herrera", "ASD123"));
    UberVan uberVan = new UberVan("FGR123", new Account("Andres Herrera", "ASD123"), "Chevrolet", "Sonic");
    uberVan.setPassenger(6);
    uberVan.printDataCar();
  }
}