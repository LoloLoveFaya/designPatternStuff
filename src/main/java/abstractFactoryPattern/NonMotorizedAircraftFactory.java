package abstractFactoryPattern;

public class NonMotorizedAircraftFactory extends AbstractFactory {

    Aircraft getAircraft(String aircraftType) {
        if (aircraftType == null) {
            return null;
        }
        if (aircraftType.equalsIgnoreCase("AEROPLANE")) {
            return new Aeroplane();

        } else if (aircraftType.equalsIgnoreCase("PARAGLIDING")) {
            return new Paragliding();
        }

        return null;
    }
}
