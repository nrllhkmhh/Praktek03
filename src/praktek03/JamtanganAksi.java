package praktek03;
public class JamtanganAksi {
    public static void main(String[] args) {
        Jamtangan j = new Jamtangan();

        j.setMerk("DW");
        j.setWarna("Black");
        j.setJenis("Jam Analog");
        j.setHarga(900000);
        
        j.cetakInfo();
        
        System.out.println("Merknya \t: ");
        System.out.println(j.getMerk());
        System.out.println("Warnanya \t: ");
        System.out.println(j.getWarna());
        System.out.println("Jenisnya \t: ");
        System.out.println(j.getJenis());
        System.out.println("Harganya \t: ");
        System.out.println(j.getHarga());
    }
}
