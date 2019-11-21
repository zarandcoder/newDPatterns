package de.esgmobility.builder.director;

import de.esgmobility.builder.components.TripComputer;
import de.esgmobility.builder.components.Transmission;
import de.esgmobility.builder.components.GPS;
import de.esgmobility.builder.components.Engine;
import de.esgmobility.builder.cars.Type;
import de.esgmobility.builder.builders.Builder;


public class Director {
    
    public void constructSportsCar(Builder builder) {
        builder.setType(Type.COUPE);
        builder.setSeats(2);
        builder.setEngine(new Engine(5.0, 1000));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPS(new GPS());
    }
    
    /** 
     
    public void constructCityCar(Builder builder) {
        builder.setType(Type.SEDAN);
        builder.setSeats(5);
        builder.setEngine(new Engine(3.0, 53455));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(null);
        builder.setGPS(null);
    }
    
    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(7);
        builder.setEngine(new Engine(7.0, 10));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPS(new GPS());
    }
    
    **/
}
