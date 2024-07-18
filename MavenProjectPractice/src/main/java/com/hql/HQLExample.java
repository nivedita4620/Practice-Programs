package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLExample {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session s = factory.openSession();

        // HQL Syntax
        String query = "from Student as s where s.city=:x and s.name=:n";
        Query<Student> q = s.createQuery(query, Student.class);

        q.setParameter("x", "Pune");
        q.setParameter("n", "Nivedita");

        // Single -> unique
        // Multiple -> list
        List<Student> list = q.list();

        for (Student student : list) {
            System.out.println(student.getName() + " : " + student.getRollno());
        }

        System.out.println("--------------------------");

        // Begin transaction
        Transaction tx = s.beginTransaction();
        // delete query
        // Corrected HQL delete query
        //Query<?> q2 = s.createQuery("delete from Student s where s.city=:c");
        //q2.setParameter("c", "Satara");
        //int r = q2.executeUpdate();
        //System.out.println("Delete..");
        //System.out.println(r);

        //update query
        Query q3=s.createQuery("update Student set city=:c where name=:n");
        q3.setParameter("c", "Delhi");
        q3.setParameter("n", "Nivedita");
        int r= q3.executeUpdate();
        System.out.println(r + "objects updated");
        
        // Commit the transaction
        tx.commit();

        s.close();
        factory.close();
    }
}
