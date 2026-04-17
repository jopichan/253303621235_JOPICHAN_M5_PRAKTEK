// Membuat class induk bernama Payment
public class Payment {
    
    // Method process versi 1 - hanya pakai jumlah uang
    public void process(int amount) {
        // Cetak teks + nilai amount ke konsol/terminal
        System.out.println("Memproses pembayaran umum: Rp " + amount);
    }
    
    // Method process versi 2 - pakai jumlah uang + kode promo
    // (nama sama tapi parameter beda = OVERLOADING)
    public void process(int amount, String promoCode) {
        // Cetak teks + nilai amount + kode promo
        System.out.println("Memproses pembayaran: Rp " + amount + 
        " dengan diskon kode " + promoCode);
    }
}