package org.onosproject.rest.resources;

import org.onosproject.net.Device;
import org.onosproject.net.device.DeviceService;
import org.onosproject.rest.AbstractWebResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Manage inventory of infrastructure devices.
 */
@Path("test")
public class Test2Resource extends AbstractWebResource {


    /**
     *  inter for test
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response test() {

        return ok("test").build();
    }




















}
