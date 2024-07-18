package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // creating question
        Question q1 = new Question();
        q1.setQuestionId(1001);
        q1.setQuestion("What is Java ? ");

        // creating answer
        Answer answer = new Answer();
        answer.setAnswerId(333);
        answer.setAnswer("Java is programming Language...");
        answer.setQuestion(q1);
        q1.setAnswer(answer);

        // creating another question
        Question q2 = new Question();
        q2.setQuestionId(1002);
        q2.setQuestion("What is Collection ? ");

        // creating another answer
        Answer answer1 = new Answer();
        answer1.setAnswerId(334);  // Changed the answerId to be unique
        answer1.setAnswer("Collection is a framework in Java...");
        answer1.setQuestion(q2);
        q2.setAnswer(answer1);

        Session s = factory.openSession();
        org.hibernate.Transaction tx = s.beginTransaction();  // Use org.hibernate.Transaction

        // Save the questions
        s.save(q1);
        s.save(q2);
        s.save(answer);
        s.save(answer1);
        // Commit the transaction
        tx.commit();

        // fetching..
       Question newQ =s.get(Question.class,1001);
       System.out.println(newQ.getQuestion());
       System.out.println(newQ.getAnswer().getAnswer());
        // Close the session
        s.close();

        // Close the factory
        factory.close();
    }
}
