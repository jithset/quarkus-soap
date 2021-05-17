package io.github.jithset.resources;

import io.github.jithset.calculator.Calculator;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api/calculator")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CalculatorResource {

    @Inject
    Calculator calculator;

    @GET
    @Path("/add/{x}/{y}")
    public int get(@PathParam("x") int x, @PathParam("y") int y) {
        return calculator.getCalculatorSoap().add(x, y);
    }
}
