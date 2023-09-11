/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor(double precio, String color, char consumoEnergetico, double peso,
                    int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la resolución del televisor (en pulgadas): ");
        resolucion = scanner.nextInt();
        System.out.print("¿Tiene sintonizador TDT? (true/false): ");
        sintonizadorTDT = scanner.nextBoolean();
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (resolucion > 40) {
            precioFinal += precioFinal * 0.3;
        }

        if (sintonizadorTDT) {
            precioFinal += 500;
        }

        return precioFinal;
    }
}