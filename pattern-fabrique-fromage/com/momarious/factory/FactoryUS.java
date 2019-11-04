package com.momarious.factory;

import com.momarious.oriental.*;
import com.momarious.reine.*;
import com.momarious.troisfromage.*;

class FactoryUS extends AbstractFactory{
    
    public AbstractReine createReine() {
        return new ReineUS();
    }

    public AbstractOriental createOriental() {
        return new OrientalUS();
    }
    
    public AbstractTroisFromage createTroisFromage() {
        return new TroisFromageUS();
    }
}