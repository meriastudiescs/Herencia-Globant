
package entities;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }
    
      @Override
    public void alimentarse(){
        System.out.println("Estoy comiendo" + alimento);
    }   
    
    
}
