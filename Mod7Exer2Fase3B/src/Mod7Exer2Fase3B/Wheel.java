package Mod7Exer2Fase3B;

//Definició de clase
public class Wheel {
    
    //Definició de variables de clase
    protected String brand;
    protected double diameter;
    
    //Definició de constructor i arguments
    public Wheel(String brand, double diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }
    
    
    //Setters i getters
    public void setMarca(String brand){
        this.brand = brand;
    }
    
    public String getMarca(){
        return brand;
    }
    
    public void setDiameter(double diameter) throws Exception{
        if(diameter < 0.4 || diameter > 4){
            throw new Exception();
        }else{
            this.diameter = diameter;
        }
    }
    
    public double getDiametre(){
        return diameter;
    }
    
}




