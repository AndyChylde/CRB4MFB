package com.andychylde.crb4;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

public class Account {

    @EmbeddedId
    private AccountNum accountNum;

    @Embeddable
    public static class AccountNum{}
}
