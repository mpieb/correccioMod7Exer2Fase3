package Mod7Exer2Fase3B;

//Definició de clasee Car herència de classe Vehicle
public class Car extends Vehicle {
    //Constructor de classe
    public Car(String plateNombre, String plateChar, String brand, String color) {
            //Crida a superclasse 
            super(plateNombre, plateChar, brand, color);
    }
    
    //Retorna les característiques de vehicle per consola
    @Override
    public String toString(){
        return "El cotxe té matrícula: " + plateNombre + " " + plateChar +
                ", de marca: " + brand + ", i color: " + color;
    }

}     

