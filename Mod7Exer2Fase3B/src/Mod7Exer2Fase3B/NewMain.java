package Mod7Exer2Fase3B;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
    TitularVehicle nouTitular = new Conductor("Pere", "Xufré", "Baqué", 1999, 11, 04);
    
    
    Llicencia crearLlicencia =new Llicencia("1234", "Cotxe", "Pere Xufré Baqué", "28/01/2030");
        try{
        crearLlicencia.setTipusLlicencia("cotxe");
        }catch(Exception e){
            System.out.println("La llicencia ha de ser de cotxe, bike o camió per poder crear vehicle!");
            }
        
    System.out.println("El titular del vehicle serà el conductor?");
        System.out.println("Si, has de pitjar 1");
        System.out.println("No, has de pitjar 2");
    
    Scanner lector = new Scanner(System.in);
    
    int decisio = lector.nextInt();
    
    if (decisio == 1){
    Vehicle nouCotxe = new Car("1234", "HOT", "Sireres", "Blanc");
        try{
        nouCotxe.setMatriculaNombre("1234");
        }catch(Exception e){
            System.out.println("S´han de possar cuatre nombres enters!");
            }
        try{
        nouCotxe.setMatriculaChar("HOT");   
        }catch(Exception e){
            System.out.println("S´han de possar dos o tres lletres majúscules");
            }
        
        System.out.println(nouCotxe);
        
        Wheel nouCotxeRodesDarrere = new WheelDarrere("Parelli", 2.2);
        try{
        nouCotxeRodesDarrere.setDiameter(2.2);
        }catch(Exception e){
            System.out.println("El diàmetre de les rodes traseres ha de ser major de 0,4 i menor de 4");
            }
        
        System.out.println(nouCotxeRodesDarrere);
        
        Wheel nouCotxeRodesDavant =new WheelDavant("Machelin", 1.9);
        try{
        nouCotxeRodesDavant.setDiameter(1.9);
        }catch(Exception e){
            System.out.println("El diàmetre de les rodes traseres ha de ser major de 0,4 i menor de 4");
            }
        
        System.out.println(nouCotxeRodesDavant);
        
        }else if(decisio == 2){
        TitularVehicle nouConductor = new Conductor("Pau", "Riba", "Tona", 1999, 9, 04);
        Llicencia nouConductorLlicencia = new Llicencia("2345", "Cotxe", "Pau Riba Tona", "23/05/2030");
        try{
        nouConductorLlicencia.setTipusLlicenciaCar("cotxe");
        }catch(Exception e){
            System.out.println("La llicencia ha de ser de cotxe per el vehicle creat!");
            }
        } 
    }
}


    
    

