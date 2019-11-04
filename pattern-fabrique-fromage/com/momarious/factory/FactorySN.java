package com.momarious.factory;

import com.momarious.oriental.*;
import com.momarious.reine.*;
import com.momarious.troisfromage.*;

class FactorySN extends AbstractFactory{
    
    public AbstractReine createReine() {
        return new ReineSN();
    }

    public AbstractOriental createOriental() {
        return new OrientalSN();
    }
    
    public AbstractTroisFromage createTroisFromage() {
        return new TroisFromageSN();
    }
}