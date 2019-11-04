import { VisaVerificateur } from './Verificateur/VisaVerificateur.js';
import { MasterCardVerificateur } from './Verificateur/MasterCardVerificateur.js';
import { AmericanExpressVerificateur } from './Verificateur/AmericanExpressVerificateur.js';

export class CarteBancaire {

    constructor(identifiant){
        this.identifiant = identifiant;
    }

    verifierCarte() {
        console.log('\nVerification de la carte ' + this.identifiant + ' ...');
        new VisaVerificateur().verifierCarte(this.identifiant);
        new MasterCardVerificateur().verifierCarte(this.identifiant);    
        new AmericanExpressVerificateur().verifierCarte(this.identifiant);
    }
}
