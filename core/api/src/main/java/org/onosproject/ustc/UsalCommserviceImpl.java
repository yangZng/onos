package org.onosproject.ustc;

import com.google.common.annotations.Beta;
import org.onosproject.net.DeviceId;
import org.onosproject.net.driver.DriverHandler;
import org.onosproject.net.driver.DriverService;
import org.osgi.service.component.annotations.Component;

/**
 *
 * @author  yangZ
 */
@Beta
@Deprecated
@Component(immediate = true, service = { UsalCommService.class })
public class UsalCommserviceImpl extends UsalCommAbstract implements UsalCommService {


    @Override
    public String test( String  url) {

        System.out.println(1);




        DeviceId deviceId = DeviceId.deviceId(url);
        DriverService service = get(DriverService.class);


        DriverHandler handler = service.createHandler(deviceId);

/*
        //fixme test1
        try {
            ControllerConfig controllerConfig=  handler.behaviour(ControllerConfig.class);
            List l=controllerConfig.getControllers();
        }catch (Exception e){
            print(e.getMessage());
        }

        //fixme NetconfSession
        try{

            NetconfController controller = handler.get(NetconfController.class);
            NetconfSession s1=controller.getNetconfDevice(handler.data().deviceId()).getSession();

        }catch (Exception e){
            print(e.getMessage());
        }

        //fixme test
        try{

            NetconfController ctr = get(NetconfController.class);

        }catch (Exception e){
            print(e.getMessage());
        }



        //fixme test3
        try{
            ConfigGetter configGetter= handler.behaviour(ConfigGetter.class);
            String var3= configGetter.getConfiguration("");

        }catch (Exception e){
            print(e.getMessage());
        }




 */


        return null;
    }

    @Override
    public void test() {

    }






}
