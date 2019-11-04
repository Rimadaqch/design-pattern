package com.momarious.factory;

import com.momarious.reine.*;
import com.momarious.oriental.*;
import com.momarious.troisfromage.*;

public abstract class AbstractFactory {

    // getFactory()
    public static AbstractFactory createFactory(String type) {
        AbstractFactory factory;
        if (type.equalsIgnoreCase("sn")){
            factory = new FactorySN();
        } else if (type.equalsIgnoreCase("us")){
            factory = new FactoryUS();
        } else
            factory = new FactoryFR();
        return factory;
    }

     // Factory Methods
  public abstract AbstractReine createReine();
  public abstract AbstractOriental createOriental();
  public abstract AbstractTroisFromage createTroisFromage();
  
}