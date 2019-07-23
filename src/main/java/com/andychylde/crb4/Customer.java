package com.andychylde.crb4;

import com.andychylde.crb4.util.Person;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.util.HashMap;
import java.util.Map;

public class Customer {

    @EmbeddedId
    private CustomerId customerId;
    private final Person person;
    @ElementCollection
    private final Map<Account.AccountNum, Account> accounts = new HashMap<>();


    //    Constructor(s)................................................................
    public Customer(Person person) {
        this.person = person;
    }

    //    Inner Class(es)...........................................................
    @Embeddable
    public static class CustomerId {
    }
}
