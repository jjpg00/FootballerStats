/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjpg0006.footbalerlstats;

/**
 *
 * @author Juan José
 */
public class Club {
    String ID;
    String Nombre;
    String Pais;
    String Liga;
    int valoracion;
    double precio;
    
 public Club(String id, String name,String country,String league, int rating, double price) {
        this.ID = id;
        this.Nombre = name;
        this.Pais = country;
        this.Liga = league;
        this.valoracion = rating;
        this.precio = price;
    }
}
