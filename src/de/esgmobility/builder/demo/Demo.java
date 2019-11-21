package de.esgmobility.builder.demo;


import de.esgmobility.builder.builders.CarBuilder;
import de.esgmobility.builder.builders.CarManualBuilder;
import de.esgmobility.builder.director.Director;
import de.esgmobility.builder.cars.Car;
import de.esgmobility.builder.cars.Manual;


public class Demo {
    
    public static void main(String[] args) {
        Director director = new Director();
        
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        
        Car car = carBuilder.getResult();
        System.out.println("Type of Car built: " + car.getType());
        
        
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("Manual for that car: \n" +  manual.print());
        
    }
}
