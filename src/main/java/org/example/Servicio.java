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

}
