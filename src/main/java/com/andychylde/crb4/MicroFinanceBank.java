package com.andychylde.crb4;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;

public class MicroFinanceBank {

    //    Attributes........................................................................
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mfbId;
    private String mfbName;
    @ElementCollection
    private final Map<Customer.CustomerId, Customer> customers = new HashMap<>();
    @ElementCollection
    private final Map<MfbEmployee.EmployeeId, MfbEmployee> mfbStaff = new HashMap<>();


    //    Setters and Getters.................................................................
    public String getMfbName() {
        return mfbName;
    }

    public void setMfbName(String mfbName) {
        this.mfbName = mfbName;
    }

    public Map<Customer.CustomerId, Customer> getCustomers() {
        return customers;
    }

    public int getMfbId() {
        return mfbId;
    }

    public void setMfbId(int mfbId) {
        this.mfbId = mfbId;
    }

    public Map<MfbEmployee.EmployeeId, MfbEmployee> getMfbStaff() {
        return mfbStaff;
    }
}
