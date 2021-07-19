package Mod7Exer2Fase3B;

//Definició de clase herencia de vehicle
public class Camio extends Vehicle {
    //Constructor
    public Camio(String plateNombre, String plateChar, String brand, String color) {
            //Crida a superclase
            super(plateNombre, plateChar, brand, color);
    }
    
    //Mètode retorn dades per consola
    @Override
    public String toString(){
        return "El camió de matrícula: " + plateNombre + " " + plateChar +
                ", marca: " + brand + ", i color: " + color;
    }
}
