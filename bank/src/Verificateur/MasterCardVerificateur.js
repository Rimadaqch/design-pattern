import { Verificateur } from './Verificateur.js';

export class MasterCardVerificateur extends Verificateur {
    
    constructor() {
        super();
    }

    verifierCarte(identifiant = ""){
        if (this.verifierDeuxPremiersCharacteres(identifiant) && this.verifierLongueur(identifiant))
            console.log('Carte MasterCard confirmé');
    }

    // Le premier charactere doit être un 5, le second doit être un compris entre 1 et 5
    verifierDeuxPremiersCharacteres(identifiant = "") {
        return identifiant.charAt(0) === '5' && (
            identifiant.charAt(1) === '1' || identifiant.charAt(1) === '2' || identifiant.charAt(1) === '3' || identifiant.charAt(1) === '4' || identifiant.charAt(1) === '5' 
            ) ;
    }

    // La longueur doit être égal à 16 
    verifierLongueur(identifiant = "") {
        return identifiant.length === 16;
    }
}