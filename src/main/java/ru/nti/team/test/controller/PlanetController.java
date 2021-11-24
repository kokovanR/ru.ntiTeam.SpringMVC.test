/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.nti.team.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import ru.nti.team.test.entity.ManagerEntity;
import ru.nti.team.test.entity.PlanetEntity;
import ru.nti.team.test.service.PlanetService;

/**
 *
 * @author Далгат
 */

@RestController

@RequestMapping("/planets")

public class PlanetController {
    
    @Autowired
    public PlanetService planetService;
    
    @PostMapping
    public ResponseEntity createPlanet(@RequestBody PlanetEntity planet,
                                       @RequestParam Long manager) {
        try {
            return ResponseEntity.ok(planetService.createPlanet(planet, manager));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Планета не создана");
        }
    }
    @PutMapping
    public ResponseEntity changeManager(@RequestBody PlanetEntity planet, @RequestParam Long id) {
        try {
            return ResponseEntity.ok(planetService.changeManager(planet, id));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Не могу изменить правителя планеты");
        }
        
    }

    @DeleteMapping("/{id}")

    public ResponseEntity deletePlanet(@PathVariable Long id) {

        try {
            return ResponseEntity.ok(planetService.deletePlanet(id));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка удаления");

        }

    }

}