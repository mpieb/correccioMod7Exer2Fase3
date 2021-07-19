package Mod7Exer2Fase3B;

import java.util.Date;
import java.util.GregorianCalendar;

//Definició de clase
public class TitularVehicle {
    //Variables de clase
    private String nom;
    private String primerCognom;
    private String segonCognom;
    private Date dataNeixement;
    private String assegurança;
    private String garatgePropi;
    
    //constructor
    public TitularVehicle(String nom, String primerCognom, String segonCognom, int agno, int mes, int dia){
        this.nom = nom;
        this.primerCognom = primerCognom;
        this.segonCognom = segonCognom;
        
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        dataNeixement = calendario.getTime();
    }
    
    //Constructor
    public TitularVehicle(String assegurança, String garatgePropi){
        this.assegurança = assegurança;
        this.garatgePropi = garatgePropi;
    }
    
    
    //Setters i getters
    public void setNom (String nom){
        this.nom = nom;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setPrimerCognom(String primerCognom){
        this.primerCognom = primerCognom;
    }
    
    public String getPrimerCognom(){
        return primerCognom;
    }
    
    public void setSegonCognom(String segonCognom){
        this.segonCognom = segonCognom;
    }
    
    public String getSegonCognom(){
        return segonCognom;
    }
    
    public void setDataNeixement(Date dataNeixement){
        this.dataNeixement = dataNeixement;
    }
    
    public Date getDataNeixement(){
        return dataNeixement ;
    }
    
    public void setAssegurança(String assegurança){
        this.assegurança = assegurança;
    }
    
    public String getAssegurança(){
        return assegurança;
    }
    
    public void setGaratgePropi(String garatgePropi){
        this.garatgePropi = garatgePropi;
    }
    
    public String getGaratgePropi(){
        return garatgePropi;
    }
}


