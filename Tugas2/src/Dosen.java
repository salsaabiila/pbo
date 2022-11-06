public class Dosen extends Elemen {
    private int jumlahHariKerja;
    private int jamSibuk;

    public Dosen(String nama, int jumlahHariKerja) {
        super(nama);
        setjumlahHariKerja(jumlahHariKerja);
        jamSibuk = jumlahHariKerja * 8;
    }

    public int getJamSibuk() {
        System.out.println(getNama() + " adalah seorang Dosen dengan jam sibuk " + jamSibuk);
        return jamSibuk;
    }

    public int getjumlahHariKerja() {
        return jumlahHariKerja;
    }

    public void setjumlahHariKerja(int newjumlahHariKerja) {
        if (newjumlahHariKerja >= 0) {
            jumlahHariKerja = newjumlahHariKerja;
        }
    }
}
