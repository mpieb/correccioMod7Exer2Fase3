package Mod7Exer2Fase3B;

//Definició de clase herència de TitularVehicle
public class Conductor extends TitularVehicle {
    
    //Constructor
    public Conductor(String nom, String primerCognom, String segonCognom, int agno, int mes, int dia){
        //Crida a la superclase
        super(nom, primerCognom, segonCognom, agno, mes, dia);
    }
    
    
}