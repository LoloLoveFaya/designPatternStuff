package factoryPattern;

public class AircraftFactory {

    public Aircraft getAircraft(String aircraftType) {
        if (aircraftType == null) {
            return null;
        }
        if (aircraftType.equalsIgnoreCase("AEROPLANE")) {
            return new Aeroplane();

        } else if (aircraftType.equalsIgnoreCase("AIRFIELD")) {
            return new Airfield();

        } else if (aircraftType.equalsIgnoreCase("AMPHIBIOUS_AIRCRAFT")) {
            return new AmphibiousAircraft();

        } else if (aircraftType.equalsIgnoreCase("PARAGLIDING")) {
            return new Paragliding();
        }

        return null;
    }
}
