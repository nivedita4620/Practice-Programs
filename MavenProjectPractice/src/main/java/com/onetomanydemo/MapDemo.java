package com.onetomanydemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // creating question
        QuestionOTM q1 = new QuestionOTM();
        q1.setQuestionId(1001);
        q1.setQuestion("What is Java ? ");

        // creating answer
        AnswerOTM answer = new AnswerOTM();
        answer.setAnswerId(333);
        answer.setAnswer("Java is programming Language...");
        answer.setQuestion(q1);

        AnswerOTM answer1 = new AnswerOTM();
        answer1.setAnswerId(334);
        answer1.setAnswer("With the help of java we can create softwares..");
        answer1.setQuestion(q1);

        AnswerOTM answer2 = new AnswerOTM();
        answer2.setAnswerId(335);
        answer2.setAnswer("Java hasdifferent types of frameworks..");
        answer2.setQuestion(q1);

        List<AnswerOTM> list = new ArrayList<>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);

        q1.setAnswers(list);
        Session s = factory.openSession();
        org.hibernate.Transaction tx = s.beginTransaction();  // Use org.hibernate.Transaction

        // Save the questions
       s.save(q1);
        // Commit the transaction
        tx.commit();

        // fetching..
        QuestionOTM newQ =s.get(QuestionOTM.class,1001);
       System.out.println(newQ.getQuestion());
       System.out.println(newQ.getAnswer().getAnswer());
        // Close the session
        s.close();

        // Close the factory
        factory.close();
    }
}
