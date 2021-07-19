package Mod7Exer2Fase3B;

//Definició de clase
public class Llicencia {
    //Variables de clase
    private String id;
    private String tipusLlicencia;
    private String nomComplet;
    private String dataCaducitat;
    private String tipusLlicenciaCar;
    private String tipusLlicenciaBike;
    private String tipusLlicenciaCamio;
    
    
    //Constructor de clase
    public Llicencia(String id, String tipusLlicencia, String nomComplet, String dataCaducitat){
        this.id = id;
        this.tipusLlicencia = tipusLlicencia;
        this.nomComplet = nomComplet;
        this.dataCaducitat = dataCaducitat;
    }
    
    //Setters i getters
    public void setId (String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setNomComplet(String nomComplet){
        this.nomComplet = nomComplet;
    }
    
    public String getNomComplet(){
        return nomComplet;
    }
    
    public void setTipusLlicencia(String tipusLlicencia)throws Exception{
        if(tipusLlicencia.equalsIgnoreCase("cotxe") || tipusLlicencia.equalsIgnoreCase("bike")
                || tipusLlicencia.equalsIgnoreCase("Camió")){
            this.tipusLlicencia = tipusLlicencia;
        }else{
            throw new Exception();
        }
    }
    
    public String getLlicencia(){
        return tipusLlicencia;
    }
    
    public void setTipusLlicenciaCar(String tipusLlicencia) throws Exception{
        if(tipusLlicencia.equalsIgnoreCase("cotxe")){
            this.tipusLlicenciaCar = tipusLlicencia;
        }else{
            throw new Exception();
        }
    }
    
    public String getTipusCar(){
        return tipusLlicenciaCar;
    }
    
    public void setTipusLlicenciaBike(String tipusLlicencia) throws Exception{
        if(tipusLlicencia.equalsIgnoreCase("bike")){
            this.tipusLlicenciaBike = tipusLlicencia;
        }else{
            throw new Exception();
        }
    }
    
    public String getTipusBike(){
        return tipusLlicenciaBike;
    }
    
    public void setTipusLlicenciaCamio(String tipusLlicencia) throws Exception{
        if(tipusLlicencia.equalsIgnoreCase("camio")){
            this.tipusLlicenciaCamio = tipusLlicencia;
        }else{
            throw new Exception();
        }
    }
    
    public String getTipusCamio(){
        return tipusLlicenciaCamio;
    }
    
    public void setDataCaducitat(String dataCaducitat){
        this.dataCaducitat = dataCaducitat;
    }
    
    public String getDataCaducitat(){
        return dataCaducitat;
    }
}
