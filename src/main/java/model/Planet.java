/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import ru.nti.team.test.entity.PlanetEntity;



/**
 *
 * @author Далгат
 */
public class Planet {
    
    private long id;
    //private long manager_id;
    private String name;

    public static Planet toModel(PlanetEntity entity) {
        Planet model = new Planet();
        
        model.setId(entity.getId());
        model.setName(entity.getName());
          
        return model;        
    } 
    public Planet() {
    
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
