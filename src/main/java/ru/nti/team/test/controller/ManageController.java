/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.nti.team.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nti.team.test.entity.ManagerEntity;
import ru.nti.team.test.service.ManageService;

/**
 *
 * @author Далгат
 */
@RestController

@RequestMapping("/managers")

public class ManageController {

    @Autowired

    public ManageService manageService;

    @PostMapping

    public ResponseEntity registr(@RequestBody ManagerEntity manager) {

        try {
            manageService.registr(manager);
            return ResponseEntity.ok("Сохранён правитель");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Правитель уже не тот");
        }

    }

   
    @RequestMapping(value="/managers", method=RequestMethod.POST)
    public ResponseEntity getManager() {
        try{
            return ResponseEntity.ok("Норм правитель");
        } catch(Exception e) {
        
            return ResponseEntity.badRequest().body("Ошибка с правителем");
            
        }
                       
    }
     @GetMapping
//    public ResponseEntity getOne(@RequestParam Long id) {
//        try {
//            return ResponseEntity.ok(manageService.getOne(id));
//        } catch (Exception e) {
//
//            return ResponseEntity.badRequest().body("Ошибка запроса правителя");
//
//        }
//
//    }  
  // @RequestMapping(value="/managers", method=RequestMethod.GET)
    public ResponseEntity get10() {
        try {
            return ResponseEntity.ok(manageService.get10());
        } catch (Exception e) {

            return ResponseEntity.badRequest().body("Ошибка запроса для 10 правителей");

        }

    }  
    
}
