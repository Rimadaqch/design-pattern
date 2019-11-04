import com.momarious.factory.*;
import com.momarious.adresse.*;
import com.momarious.telephone.*;

/*
 * Main.java
 */
public class Main {
  
  public static void main(String[] args) {
    String pays = "fr";
    
    AbstractFactory factory;
    factory = AbstractFactory.createFactory(pays);
    
    AbstractAdresse adresse = factory.createAdresse();    
    adresse.setRue("De la Montagne");
    adresse.setVille("Paris");
    adresse.setRegion("");
    adresse.setCodePostal("75002");
  
    AbstractTelephone telephone = factory.createTelephone();
    telephone.setNumero("422345432");
    
    System.out.print(adresse.toString());
    System.out.print(telephone.toString());
  }
  
}
