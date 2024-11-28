package com.collegeapp.model;

/**
 *
 * @author Prithivi
 */
public class StudentModel {
    private int lmuId;          
    private String name;        
    private String module;      
    private String contact; 

    public StudentModel() {
    }

    public StudentModel(int lmuId, String name, String module, String contact) {
            this.lmuId = lmuId;
            this.name = name;
            this.module = module;
            this.contact = contact;
        }

        // Getter and Setter for lmuId
        public int getLmuId() {
            return lmuId;
        }

        public void setLmuId(int lmuId) {
            this.lmuId = lmuId;
        }

        // Getter and Setter for name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter and Setter for module
        public String getModule() {
            return module;
        }

        public void setModule(String module) {
            this.module = module;
        }

        // Getter and Setter for contact
        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }
    }
