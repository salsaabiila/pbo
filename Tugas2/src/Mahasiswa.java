public class Mahasiswa extends Elemen {
    private int Sks;
    private int jamSibuk;

    public Mahasiswa(String nama, int Sks) {
        super(nama);
        setSks(Sks);
        jamSibuk = Sks * 3;
    }

    public int getJamSibuk() {
        System.out.println(getNama() + " adalah seorang Mahasiswa dengan jam sibuk " + jamSibuk);
        return jamSibuk;
    }

    public int getSks() {
        return Sks;
    }

    public void setSks(int newSks) {
        if (newSks >= 0) {
            Sks = newSks;
        }
    }
}
