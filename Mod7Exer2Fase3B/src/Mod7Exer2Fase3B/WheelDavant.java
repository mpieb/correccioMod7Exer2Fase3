package Mod7Exer2Fase3B;

//Defició de clase herència de Wheel
public class WheelDavant extends Wheel {
    //Constructor
    public WheelDavant(String brand, double diameter){
        //Crida a clase pare
        super(brand, diameter);
    }
    
    //Retorn de dades per consola
    @Override
    public String toString(){
        return "Les rodes del davant són de marca: " + brand + 
                ", i diàmetre de: " + diameter + " polzades";
    }
    
}