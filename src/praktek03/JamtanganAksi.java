package praktek03;
public class JamtanganAksi {
    public static void main(String[] args) {
        Jamtangan j = new Jamtangan();

        j.setMerk("DW");
        j.setWarna("Hitam");
        j.setJenis("Jam Analog");
        j.setHarga(900000);
        
        j.cetakInfo();
    }
}
