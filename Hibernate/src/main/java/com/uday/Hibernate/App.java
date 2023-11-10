package com.uday.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student stu = new Student();
        stu.setId(1);
        stu.setName("uday");
        stu.setFee(50000);
       
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session s = sf.openSession();
        s.save(stu);
       
        
        s.close();
        
        
    }
}
