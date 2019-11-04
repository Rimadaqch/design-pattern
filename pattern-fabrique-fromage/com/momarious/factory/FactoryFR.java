package com.momarious.factory;

import com.momarious.oriental.*;
import com.momarious.reine.*;
import com.momarious.troisfromage.*;

class FactoryFR extends AbstractFactory{
    
    public AbstractReine createReine() {
        return new ReineFR();
    }

    public AbstractOriental createOriental() {
        return new OrientalFR();
    }
    
    public AbstractTroisFromage createTroisFromage() {
        return new TroisFromageFR();
    }
}