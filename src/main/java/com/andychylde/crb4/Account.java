package com.andychylde.crb4;

import com.andychylde.crb4.Txn.TxnId;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


@Entity
public class Account implements Serializable {

    @EmbeddedId
    private AccountNum accountNum;
    @ElementCollection
    private final Map<Txn.TxnId, Txn> txns = new HashMap<>();

    public AccountNum getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(AccountNum accountNum) {
        this.accountNum = accountNum;
    }

    public Map<TxnId, Txn> getTxns() {
        return txns;
    }

    //    Inner/Nested class(es)................................................................
    @Embeddable
    public static class AccountNum implements Serializable {

        private int accountNum;
        private int mfbId;

        //Setters and Getters....................................................................
        public int getAccountNum() {
            return accountNum;
        }

        public void setAccountNum(int accountNum) {
            this.accountNum = accountNum;
        }

        public int getMfbId() {
            return mfbId;
        }

        public void setMfbId(int mfbId) {
            this.mfbId = mfbId;
        }
    }
}
