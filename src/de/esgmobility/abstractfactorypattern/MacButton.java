package de.esgmobility.abstractfactorypattern;


public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac Button created");    
    }
}
