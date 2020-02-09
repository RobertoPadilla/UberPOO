import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
  Map<String, ArrayList<String,Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;

  public UberBlack(String license, Account driver, String brand, String model, Map<String, ArrayList<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
    super(license, driver); //Instanciamos los atributos de la clase Car
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
  }
}