public class Simulator {
    public static void main(String[] args) {
        Mahasiswa a = new Asdos("Fairuzikun", 20, 13); // polymorphism dan upcasting
        Dosen d = new Dosen("Raja OP Damanik", 5);
        Mahasiswa b = new Asdos("Angel-chan", 20, 4);
        Mahasiswa m = new Mahasiswa("Firman", 20);
        Mahasiswa e = new Mahasiswa("Nid to Pass this sem", 23);
        Dosen f = new Dosen("Nivotko", 3);

        System.out.println("\n");
        int total = a.getJamSibuk() + d.getJamSibuk() + b.getJamSibuk() + m.getJamSibuk() + e.getJamSibuk()
                + f.getJamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + total);
        System.out.println("\n");
    }
}
