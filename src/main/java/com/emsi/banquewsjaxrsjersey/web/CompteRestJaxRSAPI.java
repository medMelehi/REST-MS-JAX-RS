package com.emsi.banquewsjaxrsjersey.web;

import com.emsi.banquewsjaxrsjersey.entities.Compte;
import com.emsi.banquewsjaxrsjersey.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/banque")
public class CompteRestJaxRSAPI {
    @Autowired
    private CompteRepository compteRepository;

    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Compte> compteList(){
        return compteRepository.findAll();
    }

    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Compte getCompte(@PathParam(value = "id") Long id){
        return compteRepository.findById(id).get();
    }

    @Path("/comptes")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Compte save(Compte compte){
        return compteRepository.save(compte);
    }

    @Path("/comptes/{id}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Compte update(Compte compte,@PathParam("id") Long id){
        compte.setId(id);
        return compteRepository.save(compte);
    }

    @Path("/comptes")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(Long id){
        compteRepository.deleteById(id);
    }
}
