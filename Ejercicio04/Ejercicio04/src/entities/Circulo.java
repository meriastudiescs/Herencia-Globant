/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import interfaces.calculosFormas;

/**
 *
 * @author maria
 */
public  class Circulo implements calculosFormas {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override    
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return PI * 2 * radio;
    }
    
}
