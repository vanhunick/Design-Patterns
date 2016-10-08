package abstractFactory.concreteFactories;

import abstractFactory.SamsungPhoneFactory;
import abstractFactory.concreteProducts.chargers.USB3Charger;
import abstractFactory.concreteProducts.devices.S7;
import abstractFactory.interfaces.Charger;
import abstractFactory.interfaces.Device;

/**
 * Created by vanhunick on 8/10/16.
 */
public class ExpensiveSamsungFactory extends SamsungPhoneFactory {
    @Override
    Charger createCharger() {
        return new USB3Charger();
    }

    @Override
    Device createDevice() {
        return new S7();
    }
}
