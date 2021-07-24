package com.tutorial.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity // JPA annotation to make Employee ready for storage in JPA based store
public class Employee {
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;


    public Employee() {

    }

    public Employee(String name, String role) {
        this.name  = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!(obj instanceof Employee))
            return false;
        Employee employee = (Employee) obj;
        return Objects.equals(this.id, employee.id) &&
                Objects.equals(this.name, employee.name) &&
                Objects.equals(this.role, employee.role);
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + this.id +
                ", name=" + this.name +
                ", role=" + this.role + " }";
    }
}
