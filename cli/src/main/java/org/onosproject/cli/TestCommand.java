package org.onosproject.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.onosproject.drivers.netconf.NetconfControllerConfig;
import org.onosproject.net.DeviceId;
import org.onosproject.net.behaviour.ConfigGetter;
import org.onosproject.net.behaviour.ControllerConfig;
import org.onosproject.net.driver.DriverHandler;
import org.onosproject.net.driver.DriverService;
import org.onosproject.netconf.NetconfController;
import org.onosproject.netconf.NetconfSession;

import java.util.Map;


@Service
@Command(scope = "onos", name = "test",
        description = "Manages component configuration")
public class TestCommand extends AbstractShellCommand{

    @Argument(index = 0, name = "uri", description = "Device ID",
            required = true, multiValued = false)
    String uri = null;


    private DeviceId deviceId;

    @Override
    protected void doExecute() {

        //todo do something for test

        //get class
      //  DriverService service = get(DriverService.class);
        //create obj
       // deviceId=DeviceId.deviceId(uri);
        //
      //  DriverHandler h = service.createHandler(deviceId);
       // ConfigGetter config=h.behaviour(ConfigGetter.class);
       // print(config.getConfiguration(("")));

      //  NetconfController netconfController=null;
      //  NetconfSession netconfSession= netconfController.getNetconfDevice(deviceId).getSession();

        DriverService service = get(DriverService.class);
        deviceId = DeviceId.deviceId(uri);
        DriverHandler h = service.createHandler(deviceId);

        ControllerConfig controllerConfig =null;
        NetconfControllerConfig netconfControllerConfig=null;
        NetconfController netconfController=null;
        NetconfSession netconfSession=null;
        ConfigGetter configGetter=null;

        //fixme test1
        try {
            controllerConfig=  h.behaviour(ControllerConfig.class);
        }catch (Exception e){

        }
        //fixme test2
        try{}catch (Exception e){


           // netconfController=h.behaviour(NetconfController.class);
            netconfSession= netconfController.getNetconfDevice(deviceId).getSession();
            netconfSession.getSessionId();

            Map m=netconfController.getDevicesMap();
        }


        //fixme test3

        try{
            configGetter= h.behaviour(ConfigGetter.class);
            String var3= configGetter.getConfiguration("");

        }catch (Exception e){

        }

    }

}
