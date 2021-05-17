package io.github.jithset.resources;

import io.github.jithset.postman.*;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/country")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CountryResource {

    @Inject
    CountryInfoService countryInfoService;

    @Inject
    CountryInfoServiceSoapType countryInfoServiceSoapType;


    @GET
    public Uni<String> get() {
//        return countryInfoServiceSoapType.listOfCountryNamesByName().getTCountryCodeAndName();

        countryInfoServiceSoapType.listOfCountryNamesByName().getTCountryCodeAndName();
        String text  = countryInfoService.getCountryInfoServiceSoap().capitalCity("IN");
        return Uni.createFrom().item(text);
    }


}
