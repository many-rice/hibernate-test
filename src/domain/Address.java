package domain;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="address_inf")
public class Address {
    @Id
    @Column(name="address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String addressDetail;
//    @ManyToOne(targetEntity = Person.class)
////    @JoinColumn(name="person_id",referencedColumnName = "person_id" ,nullable = false)
////    @Cascade(org.hibernate.annotations.CascadeType.ALL)
//    @JoinTable(name="person_address",
//            joinColumns = @JoinColumn(name="aid",referencedColumnName = "address_id",unique = true),
//            inverseJoinColumns = @JoinColumn(name="pid",referencedColumnName = "person_id")
//    )
//    @ManyToMany(targetEntity = Person.class)
//    @JoinTable(name="person_address",
//        joinColumns = @JoinColumn(name="aid",referencedColumnName = "address_id"),
//            inverseJoinColumns = @JoinColumn(name="pid",referencedColumnName = "person_id")
//    )
    @OneToOne(targetEntity = Person.class,mappedBy = "address")
    private Person person;
//    private Set<Person> personSet=new HashSet<>();
    public Address() {

    }
    public Address(String addressDetail){
        this.addressDetail=addressDetail;
    }
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
//
//    public Set<Person> getPersonSet() {
//        return personSet;
//    }
//
//    public void setPersonSet(Set<Person> personSet) {
//        this.personSet = personSet;
//    }
}
