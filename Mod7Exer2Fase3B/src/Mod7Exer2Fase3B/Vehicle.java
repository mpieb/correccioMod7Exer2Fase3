package Mod7Exer2Fase3B;

//Definició de clase
public class Vehicle {
    //Definició de variables
    protected String plateNombre;
    protected String plateChar;
    protected String brand;
    protected String color;
   
    //Mètode constructor de clase
    public Vehicle(String plateNombre, String plateChar, String brand, String color) {
        this.plateNombre = plateNombre;
        this.plateChar = plateChar;
        this.brand = brand;
        this.color = color;
    }
    
    //Setters i getters
    public void setMatriculaNombre(String plateNombre)throws Exception{
        if(plateNombre.length() == 4){
            this.plateNombre = plateNombre;
        }else{
            throw new Exception();
        }
    }
    
    public String getMatriculaNombre(){
        return  plateNombre;
    } 
    
    public void setMatriculaChar(String plateChar) throws Exception{
        if(plateChar.length() == 2 || plateChar.length() == 3){
            this.plateChar = plateChar;
        }else{
            throw new Exception();
        }
    }
    
    public String getMatriculaChar(){
        return plateChar;
    }
        
    public void setMarca(String brand){
        this.brand = brand;
    }
        
    public String getMarca(){
        return brand;
    }
        
    public void setColor(String color){
        this.color = color;
    }
        
    public String getColor(){
        return color;
    }
    
}     
        


