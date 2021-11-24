/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.nti.team.test.service;

import java.util.List;
import model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import ru.nti.team.test.entity.ManagerEntity;
import ru.nti.team.test.repo.RepoMan;
import org.springframework.stereotype.Service;
import ru.nti.team.test.repo.RepoMan10;

/**
 *
 * @author Далгат
 */
@Service
public class ManageService {

    @Autowired
    private RepoMan repo;
    
    @Autowired
    private RepoMan10 repo10;
    

    public ManagerEntity registr(ManagerEntity manager) {
        return repo.save(manager);

    }

    public Manager getOne(long id) {
        ManagerEntity man = repo.findById(id).get();
        return Manager.toModel(man);
              
    }
    
    public Manager get10() {
           
       ManagerEntity man = repo10.find10asc().get(0);
       return Manager.toModel(man);     
         
    }
}
