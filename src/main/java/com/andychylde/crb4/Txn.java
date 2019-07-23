package com.andychylde.crb4;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.time.LocalDateTime;


public class Txn implements Serializable {

    @EmbeddedId
    private TxnId txnId;
    private String txnDescription;
    private TxnType txnType;
    private double txnAmount;


    //    Setters and Getters....................................................................


    public TxnId getTxnId() {
        return txnId;
    }

    public void setTxnId(TxnId txnId) {
        this.txnId = txnId;
    }

    public String getTxnDescription() {
        return txnDescription;
    }

    public void setTxnDescription(String txnDescription) {
        this.txnDescription = txnDescription;
    }

    public TxnType getTxnType() {
        return txnType;
    }

    public void setTxnType(TxnType txnType) {
        this.txnType = txnType;
    }

    public double getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(double txnAmount) {
        this.txnAmount = txnAmount;
    }


    //    Inner/Nestesd class(es)....................................................................
    @Embeddable
    public static class TxnId implements Serializable {
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int txnNumber;
        private final LocalDateTime txnTimeStamp = LocalDateTime.now();

        public TxnId() {
        }

        public int getTxnNumber() {
            return txnNumber;
        }

        public void setTxnNumber(int txnNumber) {
            this.txnNumber = txnNumber;
        }

        public LocalDateTime getTxnTimeStamp() {
            return txnTimeStamp;
        }
    }// end of TxnId

    public enum TxnType implements Serializable {DEBIT, CREDIT}//end of TxnType
}
