/**
 * 
 */
package spConcret;

import spAbstrait.Animal;

import spAbstrait.CrierBehavior;

import spAbstrait.SeDeplacerBehavior;

/**
 * @author test
 *
 */
public class Mouton extends Animal{

	/**
	 * @param cri
	 * @param dep
	 */
	public Mouton(CrierBehavior cri, SeDeplacerBehavior dep) {
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
