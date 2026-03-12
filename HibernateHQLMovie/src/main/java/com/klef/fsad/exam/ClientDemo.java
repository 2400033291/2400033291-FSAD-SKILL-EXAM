package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ClientDemo
{
    public static void main(String[] args)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        // Insert Movie using Persistent Object
        Movie m = new Movie("RRR","2022","Released","Action",550.0);

        session.save(m);

        System.out.println("Movie Inserted Successfully");

        tx.commit();

        // HQL Update
        Transaction tx2 = session.beginTransaction();

        String hql = "update Movie set name=?1, status=?2 where id=?3";

        Query query = session.createQuery(hql);

        query.setParameter(1,"RRR Updated");
        query.setParameter(2,"Blockbuster");
        query.setParameter(3,1);

        int result = query.executeUpdate();

        System.out.println(result + " Record Updated");

        tx2.commit();

        session.close();
    }
}