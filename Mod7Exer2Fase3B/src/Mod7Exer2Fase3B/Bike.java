package Mod7Exer2Fase3B;

//Definició de clase herència de vehicle
public class Bike extends Vehicle {
    //Constructor
    public Bike(String plateNombre, String plateChar, String brand, String color){
            //Crida a la superclase
            super(plateNombre, plateChar, brand, color);
    }
    
    //Sortida de dades per consola
    @Override
    public String toString(){
        return "La moto té matrícula: " + plateNombre + " " + plateChar +
                ", de marca: " + brand + " i color: " + color;
    }
}
