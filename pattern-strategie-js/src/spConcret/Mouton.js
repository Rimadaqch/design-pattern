import { Animal } from "../spAbstrait/Animal.js";

export class Mouton extends Animal{

    constructor(cri, dep) {
        super(cri, dep);
    }

    seDeplacer() {
        this.dep.faireDeplacement();
    }

    crier() {
        this.cri.faireCri();
    }
}