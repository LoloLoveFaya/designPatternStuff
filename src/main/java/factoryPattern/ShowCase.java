package factoryPattern;

public class ShowCase {
    public static void main(String[] args) {

        AircraftFactory aircraftFactory = new AircraftFactory();

        //get an object of Aeroplane and call its draw method.
        Aircraft aeroplane = aircraftFactory.getAircraft("AEROPLANE");
        //call draw method of Aeroplane
        aeroplane.fly();

        //get an object of Airfield and call its draw method.
        Aircraft airfield = aircraftFactory.getAircraft("AIRFIELD");
        //call draw method of Airfield
        airfield.fly();

        //get an object of amphibious_aircraft and call its draw method.
        Aircraft amphibiousAircraft = aircraftFactory.getAircraft("AMPHIBIOUS_AIRCRAFT");
        //call draw method of amphibious_aircraft
        amphibiousAircraft.fly();

        //get an object of Paragliding and call its draw method.
        Aircraft paragliding = aircraftFactory.getAircraft("PARAGLIDING");
        //call draw method of Paragliding
        paragliding.fly();
    }
}
