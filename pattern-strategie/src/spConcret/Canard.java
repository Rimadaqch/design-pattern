package spConcret;

import spAbstrait.Animal;
import spAbstrait.CrierBehavior;
import spAbstrait.SeDeplacerBehavior;

public class Canard extends Animal {

	public Canard(CrierBehavior cri, SeDeplacerBehavior dep) {
		super(cri, dep);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void seDeplacer() {
		// TODO Auto-generated method stub
		dep.faireDeplacement();
	}

	@Override
	public void Crier() {
		// TODO Auto-generated method stub
		cri.faireCri();
	}

}
