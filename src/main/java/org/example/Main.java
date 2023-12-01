package org.example;

import org.example.dao.client.ClientDaoImpl;
import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.service.ClientService;
import org.example.service.PlanetService;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        //TODO save
        clientService.saveClient(createClient("Created Client"));
        //TODO delete
        clientService.deleteClient(createClient("Tokio"));
        //TODO delete by id
        clientService.deleteClientById(1L);
        //TODO get by id
        System.out.println("clientService.findClientById(2L).getName() = " + clientService.findClientById(2L).getName());
        //TODO get all
        clientService.getAllClients().forEach(client -> System.out.println(client.getName()));
        //TODO update
        clientService.updateClient(createClient(2L, "lala"));


        PlanetService planetService = new PlanetService();
        //TODO save
        planetService.savePlanet(createPlanet("OFKA1", "lala"));
        //TODO delete
        planetService.deletePlanet(createPlanet("1OP13", "Jupiter"));
        //TODO delete by id
        planetService.deletePlanetById("13AKR");
        //TODO get by id
        System.out.println("clientService.findClientById(2L).getName() = " + planetService.findPlanetById("ABC13").getName());
        //TODO get all
        planetService.getAllPlanets().forEach(planet -> System.out.println(planet.getName()));
        //TODO update
        planetService.updatePlanet(createPlanet("ABC13", "lalala"));

    }


    public static Client createClient(String name){
        Client client = new Client();
        client.setName(name);
        return client;
    }

    public static Client createClient(Long id, String name){
        Client client = createClient(name);
        client.setId(id);
        return client;
    }

    public static Planet createPlanet(String name){
        Planet planet = new Planet();
        planet.setName(name);
        return planet;
    }

    public static Planet createPlanet(String id, String name){
        Planet planet = createPlanet(name);
        planet.setId(id);
        return planet;
    }
}