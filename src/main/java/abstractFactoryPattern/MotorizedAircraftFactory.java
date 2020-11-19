package abstractFactoryPattern;

import factoryPattern.Aeroplane;
import factoryPattern.Paragliding;

public class MotorizedAircraftFactory extends AbstractFactory {

    Aircraft getAircraft(String aircraftType) {
        if (aircraftType == null) {
            return null;
        }
        if (aircraftType.equalsIgnoreCase("AIRFIELD")) {
            return new Airfield();

        } else if (aircraftType.equalsIgnoreCase("AMPHIBIOUS_AIRCRAFT")) {
            return new AmphibiousAircraft();

        }

        return null;
    }
}
