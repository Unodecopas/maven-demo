package com.example.demo.model;

public class ContactModel {
    
    private int id;
    
    private String firstname;
    
    private String lastname;
   
    private String phone;
    
    private String city;

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ContactModel(int id, String firstname, String lastname, String phone, String city) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstname='" + getFirstname() + "'" +
            ", lastname='" + getLastname() + "'" +
            ", phone='" + getPhone() + "'" +
            ", city='" + getCity() + "'" +
            "}";
    }

    public ContactModel(){}
}
