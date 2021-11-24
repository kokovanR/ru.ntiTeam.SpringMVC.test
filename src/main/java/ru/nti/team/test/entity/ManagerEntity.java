/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.nti.team.test.entity;

import java.util.List;
import javax.persistence.*;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;

/**
 *
 * @author Далгат
 */
@Entity
public class ManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "manager")
    private List <PlanetEntity> planet;
   
    
        
    public ManagerEntity() {
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

    public List <PlanetEntity> getPlanet() {
        return planet;
    }

    public void setPlanet(List <PlanetEntity> planet) {
        this.planet = planet;
    }

}