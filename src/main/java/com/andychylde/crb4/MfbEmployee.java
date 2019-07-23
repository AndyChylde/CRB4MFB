package com.andychylde.crb4;

import com.andychylde.crb4.util.Employee;
import com.andychylde.crb4.util.Person;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class MfbEmployee extends Employee {

    @Id
    private String employeeNum;
    @Id
    private int mfbId;

//    Constructor(s).................................................................
    public MfbEmployee(Person person, LocalDate employmentStartDate) {
        super(person, employmentStartDate);
    }

    public MfbEmployee(Person person) {
        super(person);
    }

    public MfbEmployee() {
    }

    public static class EmployeeId {

        //        Inner/Nested Class Attributes..............................................................
        private String employeeNum;
        private int mfbId;

        //        Inner/Nested Class Setters and Getters..............................................................
        public String getEmployeeNum() {
            return employeeNum;
        }

        public void setEmployeeNum(String employeeNum) {
            this.employeeNum = employeeNum;
        }

        public int getMfbId() {
            return mfbId;
        }

        public void setMfbId(int mfbId) {
            this.mfbId = mfbId;
        }

//        Inner/Nested Class Hash/Equals..............................................................

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EmployeeId that = (EmployeeId) o;
            return mfbId == that.mfbId &&
                    Objects.equals(employeeNum, that.employeeNum);
        }

        @Override
        public int hashCode() {
            return Objects.hash(employeeNum, mfbId);
        }
    }//end of EmployeeId


}
