package org.slillo.java_jdbc;

import org.slillo.java_jdbc.util.ConexionBBDD;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args){

        try (Connection  conn = ConexionBBDD.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet resultado = stmt.executeQuery("SELECT * FROM productos")) {


            while(resultado.next()) {
                System.out.print(resultado.getInt("id"));
                System.out.print(" | ");
                System.out.print("Resultado = " + resultado.getString("nombre"));
                System.out.print(" | ");
                System.out.print(resultado.getInt("precio"));
                System.out.print(" | ");
                System.out.println(resultado.getDate("fecha_registro"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
