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
public class LogisticsApp {
    public static void main(String[] args) {
        
        Logistics sea = new SeaLogistics();
        sea.createTransport().deliver();
        
        Logistics road = new RoadLogistics();
        road.createTransport().deliver();
    }
}
