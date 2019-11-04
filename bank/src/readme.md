# StrategyPattern.Bank
Un javascript(es6) log console application qui verify a nature de la carte bancaire qu'on lui passe en argument


# Implementation
Pour exécuter cette application, veuillez la cloner sur votre ordinateur local.

* Test.java
C'est dans cette classe qu'on instancie les cartes bancaires   
```bash
import { CarteBancaire } from './CarteBancaire.js';

new CarteBancaire("412168010400").verifierCarte();
new CarteBancaire("142168010400").verifierCarte();
new CarteBancaire("392168010400").verifierCarte();
new CarteBancaire("39216801045400").verifierCarte();
```

* CarteBancaire.java
C'est dans cette classe qui permet de verifier la nature d'une carte Bancaire. On passe l'identifiant de la carte Bancaire successivement sur un VisaVerificateur ensuite sur MasterCardVerificateur puis sur un AmericanExpressVerificateur, si l'un des vérificteur déja cité reconnait l'identifiant alors un méssage de confirmation est affiché sur la console.
```bash
import { CarteBancaire } from './CarteBancaire.js';
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
```

* Verificateur.java
L'interface Verificateur   
```bash
export class Verificateur {
    constructor() {}
    verifierCarte(identifiant) {}
}
```

* AmericanExpressVerificateur.java
Cette classe permet de vérifier si l'identifiant qui lui  est passé en argument sur la methode verifierCarte(identifiant) correspond à l'identifiant d'une carte de type AmericanExpress 
```bash
import { Verificateur} from './Verificateur.js';

export class AmericanExpressVerificateur extends Verificateur {
    
    constructor() {
        super();
    }

    verifierCarte(identifiant = ""){
        if (this.verifierDeuxPremiersCharacteres(identifiant) && this.verifierLongueur(identifiant))
            console.log('Carte AmericanExpress confirmé');
    }

    verifierDeuxPremiersCharacteres(identifiant = "") {
        return identifiant.charAt(0) === '3' && (identifiant.charAt(1) === '1' || identifiant.charAt(1) === '4') ;
    }

    verifierLongueur(identifiant = "") {
        return identifiant.length === 15;
    }
}
```

* VisaVerificateur.java
Cette classe permet de vérifier si l'identifiant qui lui  est passé en argument sur la methode verifierCarte(identifiant) correspond à l'identifiant d'une carte de type Visa 
```bash
import { Verificateur} from './Verificateur/Verificateur.js';

export class VisaVerificateur extends Verificateur {
    
    constructor() {
        super();
    }

    verifierCarte(identifiant = ""){
        if (this.verifierDeuxPremiersCharacteres(identifiant) && this.verifierLongueur(identifiant))
            console.log('Carte VISA confirmé');
    }

    verifierDeuxPremiersCharacteres(identifiant = "") {
        return identifiant.charAt(0) === '4' ;
    }

    verifierLongueur(identifiant = "") {
        return identifiant.length === 19;
    }
}
```

* MasterCardVerificateur.java
Cette classe permet de vérifier si l'identifiant qui lui  est passé en argument sur la methode verifierCarte(identifiant) correspond à l'identifiant d'une carte de type MasterCard 
```bash
import { Verificateur } from './Verificateur.js';

export class MasterCardVerificateur extends Verificateur {
    
    constructor() {
        super();
    }

    verifierCarte(identifiant = ""){
        if (this.verifierDeuxPremiersCharacteres(identifiant) && this.verifierLongueur(identifiant))
            console.log('Carte MasterCard confirmé');
    }

    verifierDeuxPremiersCharacteres(identifiant = "") {
        return identifiant.charAt(0) === '5' && (identifiant.charAt(1) === '1' || identifiant.charAt(1) === '2' || identifiant.charAt(1) === '3' || identifiant.charAt(1) === '4' || identifiant.charAt(1) === '5' ) ;
    }

    verifierLongueur(identifiant = "") {
        return identifiant.length === 16;
    }
}
```
