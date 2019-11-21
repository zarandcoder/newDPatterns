package de.esgmobility.builder.builders;

import de.esgmobility.builder.components.Engine;
import de.esgmobility.builder.components.GPS;
import de.esgmobility.builder.components.Transmission;
import de.esgmobility.builder.components.TripComputer;
import de.esgmobility.builder.cars.Type;


public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPS(GPS gps);
}
