/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.esgmobility.abstractfactorypattern;

/**
 *
 * @author zarv
 */
public class Application {
    private GUIFactory factory;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }
   
    public void createUI() {
    }
    
    public void paint() {
    }
}
