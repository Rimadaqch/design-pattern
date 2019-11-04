package spAbstrait;

public abstract class Animal {
	 
	protected CrierBehavior cri;
	 
	 protected SeDeplacerBehavior dep;
	
	 public CrierBehavior getCri() {
		return cri;
	}
	public void setCri(CrierBehavior cri) {
		this.cri = cri;
	}
	public SeDeplacerBehavior getDep() {
		return dep;
	}
	public void setDep(SeDeplacerBehavior dep) {
		this.dep = dep;
	}
	
	public abstract void seDeplacer();
	
	public abstract void Crier();
	
	//Constructeur
	public Animal(CrierBehavior cri, SeDeplacerBehavior dep){
		this.cri = cri;
		this.dep = dep;
	}

}
