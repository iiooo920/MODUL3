import java.util.ArrayList;
import java.util.List;

/**
 * Mengelola daftar kontak.
 */
public class BukuKontak {
    private List<Kontak> daftarKontak = new ArrayList<>();

    /**
     * Menambah kontak baru ke daftar.
     * @param kontak Objek Kontak yang akan ditambahkan.
     */
    public void tambahKontak(Kontak kontak) {
        daftarKontak.add(kontak);
        System.out.println("Kontak " + kontak.getNama() + " berhasil ditambahkan.");
    }

    /** Menampilkan semua kontak di daftar. */
    public void tampilkanSemuaKontak() {
        if (daftarKontak.isEmpty()) {
            System.out.println("Buku kontak kosong.");
            return;
        }
        System.out.println("--- Daftar Kontak ---");
        for (Kontak k : daftarKontak) {
            k.displayInfo();
        }
        System.out.println("---------------------");
    }
}