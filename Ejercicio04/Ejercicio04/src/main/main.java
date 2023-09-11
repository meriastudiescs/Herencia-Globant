/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Circulo;
import entities.Rectangulo;
import interfaces.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();
        calculosFormas circulo = new Circulo(radioCirculo);

        System.out.print("Ingresa la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();
        calculosFormas rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);

        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();
        double areaRectangulo = rectangulo.calcularArea();
        double perimetroRectangulo = rectangulo.calcularPerimetro();

        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Perímetro del círculo: " + perimetroCirculo);
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);

        scanner.close();
    }
    
}
