package org.onosproject.cli;

import com.google.common.annotations.Beta;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.onosproject.net.DeviceId;
import org.onosproject.net.behaviour.ConfigGetter;
import org.onosproject.net.driver.DriverHandler;
import org.onosproject.net.driver.DriverService;
import org.onosproject.ustc.UsalCommService;

/**
 *  just for test
 *
 *  desgin code rule ,shoud not be make anywhere,obey OSGi dev stabdard,
 *  like in spring (eg Controller ,Service ,DAO ),here is bundle
 *
 * @author yangZ
 */
@Beta
@Deprecated
@Service
@Command(scope = "onos", name = "test",
        description = "Manages component configuration")
public class TestCommand extends AbstractShellCommand{

    @Argument(index = 0, name = "uri", description = "Device ID",
            required = false, multiValued = false)
    String uri = null;





    @Override
    protected void doExecute() {
        //fixme to core - common
        UsalCommService services = get(UsalCommService.class);
        services.test(uri);

        // fixme to behavior

        execute(uri);



    }


    /**
     * test NetconfCOntroller
     * @param url
     */

    private void execute(String url){

        DeviceId deviceId = DeviceId.deviceId(url);
        DriverService service = get(DriverService.class);
        DriverHandler handler = service.createHandler(deviceId);

        ConfigGetter configGetter=handler.behaviour(ConfigGetter.class);
            //impl by NetconfConfigGetter
        configGetter.getConfiguration("startup");




    }


}
