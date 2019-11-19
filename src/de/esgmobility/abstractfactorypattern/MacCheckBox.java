package de.esgmobility.abstractfactorypattern;


public class MacCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Mac Checkbox created");
    }
}
