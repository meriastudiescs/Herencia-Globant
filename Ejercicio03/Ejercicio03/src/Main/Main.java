/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;


import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(new Lavadora(2000, "blanco", 'A', 30, 15)); 
        electrodomesticos.add(new Televisor(5000, "rojo", 'C', 42, 23, true)); 
        electrodomesticos.add(new Lavadora(1500, "rojo", 'B', 34, 20)); 
        electrodomesticos.add(new Televisor(4000, "negro", 'B', 32, 40, true)); 
        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println("Precio final del Electrodoméstico: $" + electrodomestico.precioFinal());

            precioTotalElectrodomesticos += electrodomestico.precioFinal();

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += electrodomestico.precioFinal();
            }
        }        
        System.out.println("Precio total de todos los electrodomésticos: $" + precioTotalElectrodomesticos);
        System.out.println("Precio total de las lavadoras: $" + precioTotalLavadoras);
        System.out.println("Precio total de los televisores: $" + precioTotalTelevisores);
    }
    }


