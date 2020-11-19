package abstractFactoryPattern;

public class ShowCase {
    public static void main(String[] args) {
        //get Motorized aircraft factory
        AbstractFactory aircraftFactory = FactoryProducer.getFactory(true);
        //get an object of Motorized aircraft AIRFIELD
        Aircraft aircraft1 = aircraftFactory.getAircraft("AIRFIELD");
        //call fly on a Motorized aircraft AIRFIELD
        aircraft1.fly();
        //get an object of Motorized aircraft AMPHIBIOUS_AIRCRAFT
        Aircraft aircraft2 = aircraftFactory.getAircraft("AMPHIBIOUS_AIRCRAFT");
        //call fly on a Motorized aircraft AIRFIELD
        aircraft2.fly();

        //get non Motorized aircraft factory
        AbstractFactory aircraftFactory1 = FactoryProducer.getFactory(false);
        //get an object of non Motorized aircraft AEROPLANE
        Aircraft aircraft3 = aircraftFactory1.getAircraft("AEROPLANE");
        ///call fly on a non Motorized aircraft AEROPLANE
        aircraft3.fly();
        //get an object of non Motorized aircraft PARAGLIDING
        Aircraft aircraft4 = aircraftFactory1.getAircraft("PARAGLIDING");
        //call fly on a non Motorized aircraft PARAGLIDING
        aircraft4.fly();
    }
}
