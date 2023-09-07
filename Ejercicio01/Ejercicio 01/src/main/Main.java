 
package main;

import entities.Animal;
import entities.Caballo;
import entities.Gato;
import entities.Perro;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args){
        
        Animal dog = new Perro("Chachi",9," Canbo","Shitzu");
        Animal cat = new Gato("Cuki",12," Galletitas","Persia");
        Animal horse = new Caballo("Pegazo",11," Perros","Fino");
        
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(dog);
        animales.add(cat);
        animales.add(horse);
        
        for (Animal aux: animales) {
            aux.alimentarse();
            System.out.println("- "+aux.getNombre());
        }
        
    }
    
}
