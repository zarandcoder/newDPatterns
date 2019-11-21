package de.esgmobility.builder.components;

/**
 *
 * @author vadim
 */
public class GPS {
    private String route;

    // Standard route
    public GPS() {
        this.route = "Ostermayrstr. 5, 80807, Munich to Anton-Webern-Weg 5, 80939, Munich";
    }
    
    // Manual route
    public GPS(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
