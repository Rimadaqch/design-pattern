import { Verificateur} from './Verificateur.js';

export class AmericanExpressVerificateur extends Verificateur {
    
    constructor() {
        super();
    }

    verifierCarte(identifiant = ""){
        if (this.verifierDeuxPremiersCharacteres(identifiant) && this.verifierLongueur(identifiant))
            console.log('Carte AmericanExpress confirmé');
    }

    // Le premier charactere doit être un 3, le second doit être un 4 ou un 7
    verifierDeuxPremiersCharacteres(identifiant = "") {
        return identifiant.charAt(0) === '3' && (identifiant.charAt(1) === '1' || identifiant.charAt(1) === '4') ;
    }

   // La longueur doit être égal à 15 
    verifierLongueur(identifiant = "") {
        return identifiant.length === 15;
    }
}