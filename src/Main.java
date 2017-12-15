import domain.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import javax.xml.crypto.dsig.TransformService;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Configuration configuration=new Configuration().configure();
        ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties())
                    .build();
        SessionFactory sf= configuration.buildSessionFactory();

        Session session1=sf.openSession();
        Transaction tx=session1.beginTransaction();
//
//        News n=new News();
//
//        n.setTitle("新签");
//        n.setContent("一个人");
//
//        session.save(n);
//

//        News news=(News)session1.get(News.class,new Integer(2));
//        System.out.println(news.getTitle());
//
//        session1.close();
//
//        news.setTitle("ct");
//        Session session2=sf.openSession();
//        Transaction tx=session2.beginTransaction();
//        System.out.println(news.getTitle());
//        session2.save(news);
//        tx.commit();
//        session2.close();
//        News news=new News();
//        news.setTitle("疯狂Java联盟成立了");
//        news.setContent("疯狂Java联盟成立了,网站地址http://www.crazyit.org");
//        news.setHappenSeason(Season.夏季);
//        File file=new File("d111.jpg");
//        byte[] content=new byte[(int)file.length()];
//        new FileInputStream(file).read(content);
//        news.setPic(content);
//        session1.save(news);
//        tx.commit();
//        News news=(News) session1.get(News.class,new Integer(1));
//        System.out.println(news.getPic().toString());
//        Person person=(Person)session1.get(Person.class,new Integer(1));
////
//        person.setAge(20);
//        person.setName("crazyit.org");
//        person.getSchools().add("小学");
//        person.getSchools().add("中学");
//        person.getSchools().add("小学");
//        person.getSchools().add("大学");
//        session1.update(person);
//        person.setAge(21);
//        person.setName("crazyit.org");
//        person.getTrainings().add("Wild Java Camp");
//        person.getTrainings().add("Sun SCJP");
//        session1.update(person);
//        Person person=new Person();
//        person.setAge(29);
//        Name name=new Name("crazyit.org","疯狂Java联盟");
//        name.getPower().put("a",1);
//        name.getPower().put("b",2);
//        person.setName(name);
//        person.getScores().put("yuwen",new Score(32,92));
//        person.getScores().put("shuxue",new Score(32,92));
//        session1.save(person);

//
//        Person temp=(Person)session1.get(Person.class,new Integer(1));

//        Address address=new Address("广州天河");
//        session1.save(address);
//
//        Address address1=new Address("上海虹口");
//        session1.save(address1);
//
        Address address2=new Address("金州勇士");
        session1.save(address2);
//
//        Person person=new Person();
//        person.setName("crazyit.org");
//        person.setAge(20);
//        person.getAddress().add(address);
//        person.getAddress().add(address2);
//        session1.save(person);
//
//        Person person1=new Person();
//        person1.setName("chentao");
//        person1.setAge(25);
//        person1.getAddress().add(address1);
//        person1.getAddress().add(address2);
//        session1.save(person1);


        Person person=new Person();
        person.setName("chentao");
        person.setAge(25);
        person.setAddress(address2);
        session1.save(person);

        tx.commit();
        session1.close();
        sf.close();
    }
}
