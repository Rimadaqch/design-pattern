package spConcret;

import spAbstrait.Animal;
import spAbstrait.CrierBehavior;
import spAbstrait.SeDeplacerBehavior;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrierBehavior cri = new Beler();
		CrierBehavior cricCac = new Caqueter();
		SeDeplacerBehavior dep = new Marcher();
		
        Animal mout =  new Mouton(cri,dep);
        mout.Crier();
        mout.seDeplacer();
        Animal can = new Canard(cricCac,dep);
        can.Crier();
        can.seDeplacer();
	}

}
;