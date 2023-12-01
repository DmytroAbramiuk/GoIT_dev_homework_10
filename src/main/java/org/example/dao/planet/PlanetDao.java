package org.example.dao.planet;

import org.example.entity.Planet;

import java.util.List;

public interface PlanetDao {
    void savePlanet(Planet planet);

    Planet findPlanetById(String id);

    void updatePlanet(Planet planet);

    void deletePlanet(Planet planet);

    void deletePlanetById(String id);

    List<Planet> getAllPlanets();
}
