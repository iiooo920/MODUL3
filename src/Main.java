/**
 * Kelas utama untuk menjalankan aplikasi buku kontak.
 */
public class Main {
    /**
     * Main method.
     * @param args Argumen CLI (tidak dipakai).
     */
    public static void main(String[] args) {
        BukuKontak buku = new BukuKontak();

        Kontak kontak1 = new Kontak("Budi", "0812345678");
        Kontak kontak2 = new Kontak("Ani", "0898765432");

        buku.tambahKontak(kontak1);
        buku.tambahKontak(kontak2);

        buku.tampilkanSemuaKontak();
    }
}