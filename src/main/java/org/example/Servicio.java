package org.example;

import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class Servicio {

    public List<String> getNOmbreProfesores(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String Consulta = "SELECT p.nombre FROM Profesor p ";
        Query<String> query = session.createQuery(Consulta,String.class);
        List<String> nombreprofes = query.getResultList();
        session.close();
        return nombreprofes;
    }

    public List<Profesor> mostrarNombreYapellido(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Profesor P ORDER BY P.edad";
        Query<Profesor> query = session.createQuery(hql, Profesor.class);
        List<Profesor> profesores = query.getResultList();
        return profesores;

    }
    public List<Profesor> Ejercicio3(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Profesor P WHERE P.edad >30 AND P.A_Experiencia >5";
        Query query = session.createQuery(hql);
        List<Profesor> profesores = query.list();
        return profesores;

    }

    public List<Profesor> Ejercicio4(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Profesor P WHERE P.edad >30 OR P.A_Experiencia >5";
        Query query = session.createQuery(hql);
        List<Profesor> profesores = query.list();
        return profesores;

    }

    public List<Profesor> Ejercicio5(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Profesor P WHERE LENGTH(P.nombre)<6";
        Query query = session.createQuery(hql);
        List<Profesor> profesores = query.list();
        return profesores;

    }


}
