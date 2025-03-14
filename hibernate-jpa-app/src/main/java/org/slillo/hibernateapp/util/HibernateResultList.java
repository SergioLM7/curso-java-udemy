package org.slillo.hibernateapp.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.slillo.hibernateapp.entity.Cliente;

import java.util.List;
import java.util.Scanner;

public class HibernateResultList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from Cliente c where c.formaPago=?1", Cliente.class);

        System.out.println("Ingrese una forma de pago(debito, credito, paypal): ");
        String pago = sc.next();

        query.setParameter(1, pago );
        List<Cliente> clientes = query.getResultList();

        System.out.println(clientes);
        em.close();
    }
}
