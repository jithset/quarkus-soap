package io.github.jithset.resources;

import io.github.jithset.postman.CountryInfoService;
import io.github.jithset.postman.TContinent;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/continent")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContinentResource {

    @Inject
    CountryInfoService countryInfoService;

    @GET
    public List<TContinent> get() {
        return countryInfoService.getCountryInfoServiceSoap().listOfContinentsByName().getTContinent();
    }
}
