package abstractFactory.concreteProducts.devices;

import abstractFactory.interfaces.Device;

/**
 * Created by vanhunick on 8/10/16.
 */
public class Iphone6 implements Device {
    @Override
    public void printName() {
        System.out.println("This is the slightly worse Iphone6");
    }
}
