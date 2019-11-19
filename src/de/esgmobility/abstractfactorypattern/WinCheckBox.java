package de.esgmobility.abstractfactorypattern;


public class WinCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Windows Checkbox created");
    }
}
