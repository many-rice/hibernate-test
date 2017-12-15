package domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="manager_inf")
@DiscriminatorValue("经理")
public class Manager extends Employee{
    private String titile;
    private double salary;
    @OneToMany(cascade = CascadeType.ALL,targetEntity = Employee.class,mappedBy = "manager")
    private Set<Employee> employeeSet=new HashSet<>();

    public Manager(){

    }
    public Manager(String titile,double salary){

    }
    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
