package praktek03;
public class JamtanganAksi {
    public static void main(String[] args) {
        Jamtangan j = new Jamtangan();

        j.setMerk("DW");
        j.setWarna("Black");
        j.setJenis("Jam Analog");
        j.setHarga(900000);
        //gak bisa j.setKekuatanJam();
        
        j.cetakInfo();
        
        System.out.println("Merknya \t: ");
        System.out.println(j.getMerk());
        System.out.println("Warnanya \t: ");
        System.out.println(j.getWarna());
        System.out.println("Jenisnya \t: ");
        System.out.println(j.getJenis());
        System.out.println("Harganya \t: ");
        System.out.println(j.getHarga());
        
        JamDinding jd = new JamDinding();
        jd.setMerk("Panasonic");
        jd.setWarna("Biru");
        jd.setJenis("Jam Digital");
        jd.setHarga(500000);
        jd.setKekuatanJam("Tahan Banting");
        jd.cetakInfo();
        System.out.println("Jenis \t: "+jd.getKekuatanJam());
        jd.throttle();
    }
}
