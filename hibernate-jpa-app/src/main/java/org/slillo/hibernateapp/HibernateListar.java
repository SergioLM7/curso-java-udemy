package org.slillo.hibernateapp;

import jakarta.persistence.EntityManager;
import org.slillo.hibernateapp.entity.Cliente;
import org.slillo.hibernateapp.util.JpaUtil;

import java.util.List;

public class HibernateListar {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c").getResultList();

        clientes.forEach(c -> System.out.println(c));
        em.close();
    }

}
