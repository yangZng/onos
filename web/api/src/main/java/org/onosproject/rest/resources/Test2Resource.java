package org.onosproject.rest.resources;

import org.onosproject.rest.AbstractWebResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * just for test ,df by yz
 */
@Path("test3")
public class Test2Resource extends AbstractWebResource {


    /*CoreWebApplication*/

    /**
     *  inter for test
     * @return
     */
    @Path("/t")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTest3() {

        return ok("").build();
    }














}
