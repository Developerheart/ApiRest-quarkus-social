package io.github.developerheart.quarkussocial.resources;

import io.github.developerheart.quarkussocial.dto.UserRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/users")
public class UserResources {

    @POST
    public Response createUser(UserRequest userRequest ){
        userRequest.setName("PROCESSADO").setSexo('p').setIdade(50);
        return Response.status(Response.Status.OK).entity(userRequest).build();
    }

    @GET
    public Response findAll(){
        return Response.status(Response.Status.OK).build();
    }

}
