package com.andychylde.crb4.util;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.registry.JAXRException;
import javax.xml.registry.infomodel.PersonName;
import java.time.LocalDate;

@Entity
public class Person {
    //    Attributes............................................................
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;
    private PersonName personName = new Person_Name();
    private LocalDate birthDate;

    //    Setters and Getters...................................................
    public String getPersonName() {
        return personName.toString();
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void updatePersonName(String fname, String mName, String surname) {
        try {
            this.personName.setFirstName(fname);
        } catch (Exception e) {
            System.out.println("Error setting First Name");
        }

        try {
            this.personName.setMiddleName(mName);
        } catch (Exception e) {
            System.out.println("Error setting Middle Name");
//            System.out.println(e.getMessage());
        }

        try {
            this.personName.setLastName(surname);
        } catch (Exception e) {
            System.out.println("Error setting Family name (ie Surname)");
        }

    }


    private static class Person_Name implements PersonName {

        //    Attributes............................................................
        String firstName = "", middleName = "", familyName = "";

        //    Setters and Getters...................................................
        public String getLastName() throws JAXRException {
            return null;
        }

        public void setLastName(String s) throws JAXRException {
            this.familyName = s;

        }

        public String getFirstName() throws JAXRException {
            return this.firstName;
        }

        public void setFirstName(String s) throws JAXRException {

            this.firstName = s;
        }

        public String getMiddleName() throws JAXRException {
            return this.middleName;
        }

        public void setMiddleName(String s) throws JAXRException {

            this.middleName = s;
        }

        public String getFullName() throws JAXRException {
            return this.toString();
        }

        public void setFullName(String s) throws JAXRException {

        }

        @Override
        public String toString() {
            return
                    firstName + " " + middleName + " " + familyName.toUpperCase();
        }
    }

}