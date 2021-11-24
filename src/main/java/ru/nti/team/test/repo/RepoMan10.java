/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.nti.team.test.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.nti.team.test.entity.ManagerEntity;

/**
 *
 * @author Далгат
 */
public interface RepoMan10 extends CrudRepository<ManagerEntity, List> {

   // interface TodoRepository extends Repository<Todo, Long> {
    
    @Query(value = "SELECT * FROM manager_entity ORDER BY age ASC LIMIT 10", nativeQuery = true)
    public List<ManagerEntity> find10asc();
   // @Query("SELECT * FROM manager_entity ORDER BY age ASC LIMIT 10 ")
//    public List<ManagerEntity>;
    
}
