package de.schoeffm.customers.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("customers")
public class CustomersResource {


    @GET
    @Produces("application/vnd.schoeffm-v1+json")
    public Response customersOld() {
        return Response.ok("Version 1.0").build();
    }

    @GET
    @Produces("application/vnd.schoeffm-v2+json")
    public Response customersNew() {
        return Response.ok("Version 2.0").build();
    }
}
