public class Asdos extends Mahasiswa {
    private int jamNgasdos;
    private int jamSibuk;

    public Asdos(String nama, int Sks, int jamNgasdos) {
        super(nama, Sks);
        setjamNgasdos(jamNgasdos);
        jamSibuk = super.jamSibuk + jamNgasdos;
    }

    public int getJamSibuk() {
        System.out.println(getNama() + "adalah seorang Asdos dengan jam sibuk " + jamSibuk);
        return jamSibuk;
    }

    public int getjamNgasdos() {
        return jamNgasdos;
    }

    public void setjamNgasdos(int newjamNgasdos) {
        if (newjamNgasdos >= 0) {
            jamNgasdos = newjamNgasdos;
        }
    }
}
