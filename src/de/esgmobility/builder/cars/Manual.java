package de.esgmobility.builder.cars;

import de.esgmobility.builder.components.Engine;
import de.esgmobility.builder.components.GPS;
import de.esgmobility.builder.components.Transmission;
import de.esgmobility.builder.components.TripComputer;

/**
 *
 * @author vadim
 */
public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPS gps;

    public Manual(Type type, int seats, Engine engine, 
            Transmission transmission, TripComputer tripComputer, GPS gps) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }


    public String print() {
        String msg = ""; 
               
        msg +=  "[Type of car: " + type + "]\n" +
                "[Number of seats: " + seats + "]\n" +
                "Engine Information:\n" + 
                "[Volume: " + engine.getVolume() + "]\n" +
                "[Mileage: " + engine.getMileage() + "]\n" +
                "[Transmission: " + transmission + "]\n";

        if(this.tripComputer != null) {
            msg += "[Trip computer: Functional]\n";
        } else {
            msg += "[Trip computer: N/A]\n";
        }
        
        if(this.gps != null) {
            msg += "[GPS Navigator: Functional]\n";
        } else {
            msg += "[GPS Navigator: N/A]\n";
        }
        return msg;
    }
}