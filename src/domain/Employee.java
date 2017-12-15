package domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("员工")
@Table(name="employee_inf")
public class Employee  extends Person{
    private String titile;
    private double salary;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employee",targetEntity = Customer.class)
    private Set<Customer> customers=new HashSet<>();
    @ManyToOne(cascade=CascadeType.ALL,targetEntity = Manager.class)
    @JoinColumn(name="manager_id",nullable = true)
    private Manager manager;
    public Employee(){

    }
    public Employee(String titile,double salary){
        this.titile=titile;
        this.salary=salary;
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

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
