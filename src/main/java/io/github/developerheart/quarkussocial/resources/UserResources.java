package io.github.developerheart.quarkussocial.resources;

import io.github.developerheart.quarkussocial.dto.UserRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/users")
public class UserResources {

    @POST
    public Response createUser(UserRequest userRequest ){
        userRequest.setName("PROCESSADO");
        return Response.status(Response.Status.OK).entity(userRequest).build();



    }

}
