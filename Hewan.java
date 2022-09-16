public class Hewan {
    String mata, mulut, telinga, kaki, ekor ;
    
 
    public void setMata(String mata) {
        this.mata = mata;
    }
 
    public void setMulut(String mulut) {
        this.mulut = mulut;
    }
 
    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }
 
    public void setKaki(String kaki) {
        this.kaki = kaki;
    }
    public void setEkor (String ekor) {
        this.ekor = ekor ;
    }
 
  
    public String getMata() {
        return mata;
    }
 
    public String getMulut() {
        return mulut;
    }
 
    public String getTelinga() {
        return telinga;
    }
 
    
    public String getKaki() {
        return kaki;
    }
     public String getEkor () {
     return ekor;
     }
    
    void bermain( String m ){ //dgn parameter
        System.out.println("Sedang bermain "+ m);
    }
    
    void makan(){ //tanpa parameter
        System.out.println("Mau makan Wiskhas");
    }
    
    void tidur(String tempat){ //2 paramater
         System.out.println("Kucing tidur di "+ tempat );
    
    }
 
}