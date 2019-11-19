package de.esgmobility.abstractfactorypattern;


public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button created");
    }
}
