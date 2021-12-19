package io.github.developerheart.quarkussocial.resources;

import io.github.developerheart.quarkussocial.domain.User;
import io.github.developerheart.quarkussocial.dto.UserRequest;
import io.github.developerheart.quarkussocial.mapper.UserMapper;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/user")
public class UserResources {

    @POST
    @Transactional
    public Response createUser(UserRequest userRequest ){
        User user = UserMapper.toEntity(userRequest);
        user.persistAndFlush();

        return Response.status(Response.Status.OK).entity(UserMapper.toResponse(user)).build();
    }

    @GET
    public Response findAll(){
        return Response.status(Response.Status.OK).build();
    }

}
