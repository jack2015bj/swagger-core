package io.swagger.v3.jaxrs2.petstore.operation;

import io.swagger.v3.jaxrs2.resources.exception.NotFoundException;
import io.swagger.v3.jaxrs2.resources.model.Pet;
import io.swagger.v3.jaxrs2.resources.model.User;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Resource with Complete Operations Examples
 */
public class OperationResource {
    /*implements
} InterfaceResource {
    @Override
    @Operation(summary = "Find pet by ID Operation in SubResource",
            description = "Returns a pet in SubResource"
    )
    public Response getPetById(final Long petId) {
        return Response.ok().entity(new Pet()).build();
    }

    @GET
    @Path("/combinatedfullyannotatedoperation/{petId}")
    @Operation(summary = "Find pet by ID",
            description = "Returns a pet when 0 < ID <= 10.  ID > 10 or non integers will simulate API error conditions",
            operationId = "petId",
            responses = {
                    @ApiResponse(
                            description = "The pet", content = @Content(
                            schema = @Schema(implementation = Pet.class)
                    )),
                    @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
                    @ApiResponse(responseCode = "404", description = "Pet not found")
            })
    public Response getPetById(
            @Parameter(description = "ID of pet that needs to be fetched", required = true)
            @PathParam("petId") final Long petId, final String message) throws NotFoundException {
        return Response.ok().entity(new Pet()).build();
    }

    @Path("/combinatedotannotatedoperation")
    @GET
    public String getUser() {
        return new String();
    }

    @Path("/combinatednotannotatedoperationduplicated")
    @GET
    public String getUser(final String id) {
        return new String();
    }

    @Path("/combinatedsameOperationName")
    @GET
    @Operation(operationId = "combinated sameOperationName",
            description = "Same Operation Name")
    public String getPerson() {
        return new String();
    }

    @Path("/combinatedsameOperationNameDuplicated")
    @GET
    @Operation(operationId = "combinatedsameOperationNameDuplicated",
            description = "Same Operation Name Duplicated")
    public String getPerson(final String id) {
        return new String();
    }*/
}
