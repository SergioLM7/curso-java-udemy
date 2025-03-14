package org.slillo.hibernateapp.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.slillo.hibernateapp.entity.Cliente;

import java.util.Scanner;

public class HibernateListarID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ID: ");
        Long id = sc.nextLong();

        EntityManager em = JpaUtil.getEntityManager();
        Cliente cliente = em.find(Cliente.class, id);

        System.out.println(cliente);

        Cliente cliente2 = em.find(Cliente.class, 4L);
        System.out.println(cliente2);

        em.close();
    }
}
