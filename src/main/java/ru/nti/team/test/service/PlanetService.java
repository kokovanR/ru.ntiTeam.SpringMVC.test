/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.nti.team.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nti.team.test.entity.ManagerEntity;
import ru.nti.team.test.entity.PlanetEntity;
import ru.nti.team.test.repo.RepoMan;
import ru.nti.team.test.repo.RepoPlan;

/**
 *
 * @author Далгат
 */
@Service

public class PlanetService {

    @Autowired
    public RepoPlan repoPlanet;

    @Autowired
    public RepoMan repoManager;

    public PlanetEntity reg(PlanetEntity planet) {

        return repoPlanet.save(planet);

    }

    public PlanetEntity createPlanet(PlanetEntity planet, Long manager) {
        ManagerEntity man = repoManager.findById(manager).get();
        planet.setManager(man);
        return repoPlanet.save(planet);

    }

    public PlanetEntity changeManager(PlanetEntity planet, Long id) {
        PlanetEntity plan = repoPlanet.findById(id).get();
        plan.setName(planet.getName());
        plan.setManager(planet.getManager());
        return repoPlanet.save(plan);
    }
    
    public Long deletePlanet(Long id) {
        repoPlanet.deleteById(id);
        return id;
    }
   
}