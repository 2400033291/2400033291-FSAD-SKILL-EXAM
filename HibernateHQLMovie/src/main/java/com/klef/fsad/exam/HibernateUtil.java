package com.klef.fsad.exam;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil
{
    private static SessionFactory sessionFactory;

    static
    {
        try
        {
            Configuration cfg = new Configuration();

            cfg.configure("hibernate.cfg.xml");

            cfg.addAnnotatedClass(Movie.class);

            ServiceRegistry serviceRegistry =
            new StandardServiceRegistryBuilder()
            .applySettings(cfg.getProperties()).build();

            sessionFactory = cfg.buildSessionFactory(serviceRegistry);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}