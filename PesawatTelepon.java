public class PesawatTelepon {
    String bentuk, kabel, gagang ;
    
    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }
    public void setKabel(String kabel) {
        this.kabel = kabel;
    }
    public void setGagang(String gagang) {
        this.gagang = gagang;
    }
    public String getBentuk() {
        return bentuk;
    }
    public String getKabel() {
        return kabel;
    }
    public String getGagang(){
        return gagang;
    }
 
    
    void menerima_panggilan( String m ){ //dgn parameter
        System.out.println("Sedang Menerima Panggilan dari "+ m);
    }
    
    void melakukan_panggilan( String m){ //tanpa parameter
        System.out.println("Sedang Melakukan panggilan dengan"+ m);
    }
    
}