/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.model;

import java.io.Serializable;

public class Student implements Serializable {
    private transient int stdId;
    private String firstname;
    private String lastname;

    public Student() {
    }

    public Student(int stdId, String firstname, String lastname) {
        this.stdId = stdId;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", firstname=" + firstname + ", lastname=" + lastname + '}';
    }
    
}
