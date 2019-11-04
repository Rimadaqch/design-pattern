import { Beler } from '../spConcret/Beler.js';
import { Caqueter } from '../spConcret/Caqueter.js';
import { Marcher } from '../spConcret/Marcher.js';
import { Mouton } from '../spConcret/Mouton.js';
import { Canard } from '../spConcret/Canard.js';



const cri = new Beler();
const cricCac = new Caqueter();
const dep = new Marcher();

const mout =  new Mouton(cri, dep);
mout.crier();
mout.seDeplacer();

const can = new Canard(cricCac, dep);
can.crier();
can.seDeplacer();