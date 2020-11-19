package abstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean motorized) {
        if (motorized) {
            return new MotorizedAircraftFactory();
        } else {
            return new NonMotorizedAircraftFactory();
        }
    }
}
