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
public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivered by truck\n");
    }
    
}
