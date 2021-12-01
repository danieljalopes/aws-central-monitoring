package com.example.resources;

import com.example.beans.NumberGeneratorExecutioner;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/generator")
public class GeneratorResource {

    @Inject
    private NumberGeneratorExecutioner numberGeneratorExecutioner;



    @GET
    @Path("/start")
    @Produces(MediaType.TEXT_PLAIN)
    public String start(){
        return this.numberGeneratorExecutioner.startNewIntegerGenerator();
    }
}
