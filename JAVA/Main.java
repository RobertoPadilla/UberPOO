class Main {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");
    Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
    car.passenger = 4;
    Car car2 = new Car("QWE123", new Account("Andrea Herrera", "ANA123"));
    car.passenger = 3;
    car.printDataCar();
    car2.printDataCar();
  }
}