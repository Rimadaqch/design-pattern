import com.momarious.factory.AbstractFactory;
import com.momarious.oriental.AbstractOriental;
import com.momarious.oriental.OrientalSN;
import com.momarious.reine.AbstractReine;
import com.momarious.troisfromage.AbstractTroisFromage;

class Client {

    public static void main(String[] args) {
        
        String pays = "fr";
    
        AbstractFactory factory;
        factory = AbstractFactory.createFactory(pays);
        
        AbstractTroisFromage troisFromage = factory.createTroisFromage();    
        AbstractReine reine = factory.createReine();
        AbstractOriental oriental = factory.createOriental();
        
        System.out.print(troisFromage.toString());
        System.out.print(reine.toString());
        System.out.print(oriental.toString());
    }

   

}