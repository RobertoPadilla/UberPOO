import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
  private Integer passenger;
  Map<String, Map<String,Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;

  public UberVan(String license, Account driver, String brand, String model){
    super(license, driver); //Instanciamos los atributos de la clase Car
    // this.typeCarAccepted = typeCarAccepted;
    // this.seatsMaterial = seatsMaterial;
  }
  @Override
  public void setPassenger(Integer passenger) {
    if(passenger == 6){
      this.passenger = passenger;
    }else{
      System.out.println("Necesitas asignar 6 pasajeros");
    }
  }
}