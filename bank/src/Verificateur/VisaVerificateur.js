import { Verificateur} from './Verificateur.js';

export class VisaVerificateur extends Verificateur {
    
    constructor() {
        super();
    }

    verifierCarte(identifiant = "") {
        if (this.verifierDeuxPremiersCharacteres(identifiant) && this.verifierLongueur(identifiant))
            console.log('Carte VISA confirmé');
    }

    // Le premier charactere doit être un 4
    verifierDeuxPremiersCharacteres(identifiant = "") {
        return identifiant.charAt(0) === '1' && identifiant.charAt(1) === '4' ;
    }

    // La longueur doit être égal à 19
    verifierLongueur(identifiant = "") {
        return identifiant.length === 19;
    }
}