package Mod7Exer2Fase3B;

//Definició de classe herència de Wheel
public class WheelDarrere extends Wheel {
    //Constructor de classe
    public WheelDarrere(String brand, double diameter){
        //Crida a la clase pare
        super(brand, diameter);
    }
    
    //Mètode per treure marca i diàmetre per consola
    @Override
    public String toString(){
        return "Les rodes del darrere són de marca: " + brand + 
                ", i el diàmetre de: " + diameter + " polzades";
    }
    
}