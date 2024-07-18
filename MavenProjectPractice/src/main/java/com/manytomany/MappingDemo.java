package com.manytomany;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo
{

	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Emp e1 = new Emp();
        Emp e2 = new Emp();

        e1.setEid(101);
        e1.setName("Nivedita");

        e2.setEid(102);
        e2.setName("Akanksha");

        Project p1 = new Project();
        Project p2 = new Project();

        p1.setPid(111);
        p1.setProjectName("Library Management");

        p2.setPid(222);
        p2.setProjectName("Gym Management");
        factory.close();
	}

}
