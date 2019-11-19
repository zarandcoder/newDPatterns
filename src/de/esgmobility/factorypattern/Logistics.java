/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.esgmobility.factorypattern;

/**
 *
 * @author zarv
 */
public abstract class Logistics {
    
    public void planDelivery() {
        System.out.println("Delivery planed\n");
    }
    
    public abstract Transport createTransport();
}
