public class Main {
    // Variabel instance
    private String nama;
    private int usia;
    private String kesukaan;
    private String makanan;
    private String tempatFavorite;

    // Konstruktor
    public Main(String nama, int usia, String kesukaan, String makanan, String tempatFavorite) {
        this.nama = nama;
        this.usia = usia;
        this.kesukaan = kesukaan;
        this.makanan = makanan;
        this.tempatFavorite = tempatFavorite;
    }

    // Metode untuk mengeluarkan suara kucing
    public void bersuara() {
        System.out.println("Meow!");
    }

    // Metode untuk mendapatkan informasi kucing
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Kesukaan : " + kesukaan);
        System.out.println("Makanan : " + makanan);
        System.out.println("Tempat Favorite: " + tempatFavorite);
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek kucing
        Main kucingSaya = new Main("Tom", 3, "Bermain Bola Tali", "Whiskas", "Keranjang Tidur Kucing");

        // Memanggil metode untuk mengeluarkan suara dan menampilkan informasi kucing
        kucingSaya.bersuara();
        kucingSaya.info();
}
}