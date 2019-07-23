package com.andychylde.crb4.util;

import java.time.LocalDate;


public abstract class Employee {
    //    Attributes.....................................................................

    private LocalDate employmentStartDate, employmentEndDate;
    private final Person person;


    //    Constructor(s)..................................................................
    public Employee(Person person) {
        this.person = person;
    }

    public Employee(Person person, LocalDate employmentStartDate) {
        this.person = person;
        this.employmentStartDate = employmentStartDate;
    }

    public Employee() {
        this.person = new Person();
    }
}
