package abstractFactory.concreteFactories;

import abstractFactory.SamsungPhoneFactory;
import abstractFactory.concreteProducts.chargers.USB2Charger;
import abstractFactory.concreteProducts.devices.S6;
import abstractFactory.concreteProducts.devices.S7;
import abstractFactory.interfaces.Charger;
import abstractFactory.interfaces.Device;

/**
 * Created by vanhunick on 8/10/16.
 */
public class CheapSamsungFactory extends SamsungPhoneFactory {

    @Override
    Charger createCharger() {
        return new USB2Charger();
    }

    @Override
    Device createDevice() {
        return new S6();
    }
}
