package domain;


import org.hibernate.annotations.Parent;

import javax.persistence.*;
import java.util.*;

//@Embeddable
public class Name implements java.io.Serializable{
//    @Column(name="person_firstname")
    private String firsts;
//    @Column(name="person_lastname")
    private String lasts;

////    @Parent
//    private Person owner;

//    @ElementCollection(targetClass = Integer.class)
//    @CollectionTable(
//            name="power_inf",
//            joinColumns = @JoinColumn(name="person_name_id",nullable = false)
//    )
//    @MapKeyClass(String.class)
//    @MapKeyColumn(name="name_aspect")
//    @Column(name="name_power",nullable = false)
//    private Map<String,Integer> power=new HashMap<>();

    public Name()
    {

    }
    public Name(String firsts, String lasts)
    {
        this.firsts = firsts;
        this.lasts = lasts;
    }
    public String getFirsts() {
        return firsts;
    }

    public void setFirsts(String firsts) {
        this.firsts = firsts;
    }

    public String getLasts() {
        return lasts;
    }

    public void setLasts(String lasts) {
        this.lasts = lasts;
    }
//
//    public Person getOwner() {
//        return owner;
//    }
//
//    public void setOwner(Person owner) {
//        this.owner = owner;
//    }

//    public Map<String, Integer> getPower() {
//        return power;
//    }
//
//    public void setPower(Map<String, Integer> power) {
//        this.power = power;
//    }

    @Override
    public int hashCode() {
        return getFirsts().hashCode()*31+getLasts().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }
        if(obj!=null && obj.getClass()== Name.class)
        {
            Name target=(Name)obj;
            return target.getFirsts().equals(getFirsts()) && target.getLasts().equals(getLasts());
        }
        return false;
    }
}
