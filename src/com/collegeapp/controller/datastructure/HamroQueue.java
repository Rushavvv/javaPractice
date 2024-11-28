/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collegeapp.controller.datastructure;
import com.collegeapp.model.StudentModel;
import java.util.ArrayList;

/**
 *
 * @author rushav
 * 
 */
public class HamroQueue {
    private final ArrayList<StudentModel> studentList;
    private final int capacity;
    
    public HamroQueue(int capacity){
        studentList = new ArrayList();
        this.capacity = capacity;
        
    }
    /**
     * 
     * @param student
     * @return end pointer ma kati cha bhnera dekhaunu paryo
     */
    public boolean enQueue(StudentModel student){
        if(isFull()) return false;
        studentList.addLast(student);
        return true;
    }
    
    public StudentModel deQueue(){
        return studentList.removeFirst();
    }
    
    public boolean isFull(){
        return studentList.size() == capacity;
    }
    
    public int poll(){
        return studentList.size();
    }
    
    public StudentModel peek(){
        return studentList.getFirst();   
    }
    
    
    
    
}
