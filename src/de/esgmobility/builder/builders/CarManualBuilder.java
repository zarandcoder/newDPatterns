package de.esgmobility.builder.builders;

import de.esgmobility.builder.components.Engine;
import de.esgmobility.builder.components.GPS;
import de.esgmobility.builder.cars.Manual;
import de.esgmobility.builder.components.Transmission;
import de.esgmobility.builder.components.TripComputer;
import de.esgmobility.builder.cars.Type;

/**
 *
 * @author vadim
 */
public class CarManualBuilder implements Builder {
    
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPS gps;
    
    
    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(GPS gps) {
        this.gps = gps;
    }
    
    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gps);
    }
}
