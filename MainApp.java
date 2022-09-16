public class MainApp {

    public static void main (String [] args)  {
        Hewan m = new Hewan ();
        
        m.setMata ("Biru");
        System.out.println ("Matanya "+ m.getMata ());
        m.setKaki ("empat");
        System.out.println ("Kakinya berjumlah"+ m.getKaki());
        m.setEkor ("Belang");
        System.out.println ("Ekornya berwarna"+ m.getEkor());
        m.bermain("Bola");
        m.makan();
        m.tidur("Teras");
    }
}