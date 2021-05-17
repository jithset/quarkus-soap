package io.github.jithset.resources;

import io.github.jithset.postman.*;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/country")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CountryResource {

    @Inject
    CountryInfoService countryInfoService;

    @GET
    @Path("/byname")
    public List<TCountryCodeAndName> getCountryByName() {
        return countryInfoService.getCountryInfoServiceSoap().listOfCountryNamesByName().getTCountryCodeAndName();
    }

    @GET
    @Path("/{countryCode}/capital")
    public String getCapitalByCountry(@PathParam("countryCode") String countryCode) {
        return countryInfoService.getCountryInfoServiceSoap().capitalCity(countryCode);
    }

    @GET
    @Path("/{countryCode}/currency")
    public TCurrency getCurrencyByCountry(@PathParam("countryCode") String countryCode) {
        return countryInfoService.getCountryInfoServiceSoap().countryCurrency(countryCode);
    }

    @GET
    @Path("/{countryCode}/flag")
    public String getFlagByCountry(@PathParam("countryCode") String countryCode) {
        return countryInfoService.getCountryInfoServiceSoap().countryFlag(countryCode);
    }

    @GET
    @Path("/{countryCode}/phone")
    public List<TContinent> getPhoneByCountry(@PathParam("countryCode") String countryCode) {
        return countryInfoService.getCountryInfoServiceSoap().countryIntPhoneCode(countryCode);
    }
}
