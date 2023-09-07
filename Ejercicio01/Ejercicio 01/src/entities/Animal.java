
package entities;

public abstract class Animal {
   
    protected String nombre;
    
    protected int edad;
    
    protected String alimento;
    
    protected String raza;
    
    public Animal(){}

    public Animal(String nombre, int edad, String alimento, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
        this.raza = raza;
    }

    public abstract void alimentarse();

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
