public class mainapp1{

    public static void main (String [] args)  {
        PesawatTelepon m = new PesawatTelepon ();
        
        m.setBentuk ("Jadul");
        System.out.println ("Bentuknya masih"+ m.getBentuk ());
        m.setKabel("Mode Lama");
        System.out.println("kabelnya masi"+ m.getKabel());
        m.setGagang("Pelastis");
        System.out.println("Menggunakan Gagang"+ m.getGagang());
        
        m.menerima_panggilan("ibu");
        m.melakukan_panggilan("ayah");
    }
}