
package main;


import entities.Electrodomestico;
import entities.Lavadora;
import entities.Televisor;

public class main {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();

        lavadora.crearLavadora();
        televisor.crearTelevisor();

        System.out.println("Precio final de la Lavadora: $" + lavadora.precioFinal());
        System.out.println("Precio final del Televisor: $" + televisor.precioFinal());
    }
}

