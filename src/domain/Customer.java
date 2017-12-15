package domain;

import javax.persistence.*;

@Entity
@Table(name="customer_inf")
@DiscriminatorValue("客户")
public class Customer  extends Person{
    String company;
    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Employee.class)
    @JoinColumn(name="employee_id",referencedColumnName = "person_id")
    private Employee employee;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
