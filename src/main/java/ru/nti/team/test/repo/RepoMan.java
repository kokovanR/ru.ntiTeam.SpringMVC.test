/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ru.nti.team.test.repo;

import org.springframework.data.repository.CrudRepository;
import ru.nti.team.test.entity.ManagerEntity;

/**
 *
 * @author Далгат
 */
public interface RepoMan extends CrudRepository <ManagerEntity, Long> {

    //public Object findById(ManagerEntity manager);
    
    
}
