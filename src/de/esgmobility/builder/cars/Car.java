package de.esgmobility.builder.cars;

import de.esgmobility.builder.components.Engine;
import de.esgmobility.builder.components.GPS;
import de.esgmobility.builder.components.Transmission;
import de.esgmobility.builder.components.TripComputer;

/**
 *
 * @author vadim
 */
public class Car {
    
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPS gps;
    private double fuel = 0;

    public Car(Type type, int seats, Engine engine, Transmission transmission,
            TripComputer tripComputer, GPS gps) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.tripComputer.setCar(this);
        this.gps = gps;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPS getGps() {
        return gps;
    }    
}
