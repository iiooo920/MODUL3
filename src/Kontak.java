/**
 * Merepresentasikan satu entri kontak.
 */
public class Kontak {
    private String nama;
    private String nomorTelepon;
    private String email;
    /**
     * Constructor.
     * @param nama Nama kontak.
     * @param nomorTelepon Nomor telepon kontak.
     */
    public Kontak(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    // --- Getter ---
    public String getNama() { return nama; }
    public String getNomorTelepon() { return nomorTelepon; }
    public String getEmail() { return email; }
    /** Menampilkan info kontak. */
    public void displayInfo() {
        System.out.println("Nama: " + nama + ", Telp: " + nomorTelepon);
    }
}