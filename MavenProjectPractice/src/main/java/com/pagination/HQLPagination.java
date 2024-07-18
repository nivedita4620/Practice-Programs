package com.pagination;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HQLPagination {
    public static void main(String[] args) {
        // Creating a SessionFactory object to initialize Hibernate
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        // Open a session to interact with the database
        Session session = factory.openSession();

        try {
            // HQL query to fetch all students
            String hql = "from Student";
            Query<Student1> query = session.createQuery(hql, Student1.class);
            
            // Set pagination parameters
            // Starting index of the results
            int startIndex = 0;
            // Maximum number of results to fetch
            int maxResults = 5;
            
            // Apply pagination
            query.setFirstResult(startIndex); // Set the starting index
            query.setMaxResults(maxResults);  // Set the maximum number of results to fetch
            
            // Execute the query and get the results
            List<Student1> students = query.list();
            
            // Iterate through the results and print them
            for (Student1 student : students) {
                System.out.println(student.getName() + " : " + student.getRollno());
            }
        } finally {
            // Closing the session and factory to release resources
            session.close();
            factory.close();
        }
    }
}
