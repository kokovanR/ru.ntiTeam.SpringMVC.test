/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.stream.Collectors;
import ru.nti.team.test.entity.ManagerEntity;

/**
 *
 * @author Далгат
 */
public class Manager {

    
    
    private long id;
    private String name;
    private int age;
    private List<Planet> listPlanet;
    

    public static Manager toModel(ManagerEntity entity) {
        Manager model = new Manager();
        
        model.setId(entity.getId());
        model.setAge(entity.getAge());
        model.setName(entity.getName());
        model.setListPlanet(entity.getPlanet().stream().map(Planet::toModel).collect(Collectors.toList()));
        
        return model;        
    } 
    
    public Manager() {
        
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }    

    public List<Planet> getListPlanet() {
        return listPlanet;
    }

    public void setListPlanet(List<Planet> listPlanet) {
        this.listPlanet = listPlanet;
    }

   
}
