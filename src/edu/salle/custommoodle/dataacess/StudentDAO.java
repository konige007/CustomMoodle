/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataacess;

import edu.salle.custommoodle.model.Student;
import java.util.List;

/**
 *
 * @author JoséPabloGutiérrezPaliza
 */
public interface StudentDAO {
    
    public Student save(Student student);
    
    public List<Student> findAll();
    
    public Student find(String id);
    
    public Student findByLastName(String lastName);
    
    public void delete(Student student);
    
    public void update(Student student);
    
}
