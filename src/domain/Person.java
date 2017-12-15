package domain;

import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;
import org.hibernate.annotations.Cascade;


import javax.persistence.*;
import java.util.*;

@Entity
@DiscriminatorColumn(name="person_type",
        discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("普通人")
@Table(name="person_inf")
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="person_id")
    private Integer id;
    private String name;
    private int age;
    private char gender;
//    @OneToOne(targetEntity = Address.class)
//    @JoinColumn(name="aid",referencedColumnName = "address_id",unique = true)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="detail" , column = @Column(name="address_detail")),
            @AttributeOverride(name="zip",column = @Column(name="address_zip")),
            @AttributeOverride(name="country",column = @Column(name="address_country"))
    })
    private Address address;
//    @ManyToMany(targetEntity = Address.class)
//    @OneToMany(targetEntity = Address.class,mappedBy = "person")
//    @JoinColumn(name="person_id",referencedColumnName = "person_id")
//    @OneToOne(targetEntity = Address.class)
//    @JoinColumn(name="address",nullable = false,referencedColumnName ="address_id" )
//    @JoinTable(name="person_address",
//            joinColumns = @JoinColumn(name="person_id",referencedColumnName = "person_id"),
//            inverseJoinColumns = @JoinColumn(name="address_id",referencedColumnName = "address_id")
//    )
//    @JoinColumn(name="address_id",unique = true)
//    @JoinTable(name="person_address",
//        joinColumns = @JoinColumn(name="personid" , referencedColumnName = "pid",unique = true),
//            inverseJoinColumns = @JoinColumn(name="addressid",referencedColumnName = "address_id",unique = true)
//    )
//    @JoinTable(
//            name="person_address",
//            joinColumns = @JoinColumn(name="p_id" , referencedColumnName = "person_id"),
//            inverseJoinColumns = @JoinColumn(name="a_id",referencedColumnName = "address_id")
//    )
//    @JoinTable(
//            name="person_address",
//            joinColumns = @JoinColumn(name="p_id",referencedColumnName = "person_id"),
//            inverseJoinColumns = @JoinColumn(name="a_id",referencedColumnName = "address_id")
//    )
//    @Cascade(org.hibernate.annotations.CascadeType.ALL)
//    private Address address;
//    @JoinTable(name="person_address",
//            joinColumns = @JoinColumn(name="pid",referencedColumnName = "person_id"),
//            inverseJoinColumns = @JoinColumn(name="aid",referencedColumnName = "address_id")
//    )
//    private Set<Address> address=new HashSet<>();

//    @ElementCollection(targetClass = String.class)
//    @CollectionTable(
//            name="training_inf",
//            joinColumns = @JoinColumn(name="person_id",nullable = false)
//    )
//    @Column(name="training_name",nullable = false)
//    @SortNatural
//    private SortedSet<String> trainings= new TreeSet<>();
//    @Embedded
//    @AttributeOverrides(
//            {
//                    @AttributeOverride(name="firsts",column = @Column(name="firstname")),
//                    @AttributeOverride(name="lasts",column = @Column(name="lastname"))
//            }
//    )
//    @EmbeddedId
//    @AttributeOverrides({
//            @AttributeOverride(name="firsts",column = @Column(name="person_firstname")),
//            @AttributeOverride(name="lasts",column = @Column(name="person_lastname"))}
//    )
//    private Name name;
//
//    @ElementCollection(targetClass =Score.class)
//    @CollectionTable(name="score_inf",
//        joinColumns = @JoinColumn(name="person_id",nullable = false)
//    )
//    @MapKeyClass(String.class)
//    @MapKeyColumn(name="subject_name")
//    private Map<String,Score> scores=new HashMap<>();
//
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//
//    public void setName(Name name) {
//        this.name = name;
//    }

//    public Map<String, Score> getScores() {
//        return scores;
//    }
//
//    public void setScores(Map<String, Score> scores) {
//        this.scores = scores;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//
//    public Set<Address> getAddress() {
//        return address;
//    }
//
//    public void setAddress(Set<Address> address) {
//        this.address = address;
//    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public Person(){

    }
    public Person(String name,char gender){
        this.name=name;
        this.gender=gender;
    }
}
