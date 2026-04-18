public class MainGateway {
    public static void main(String[] args) {

        // Upcasting
       Payment[] payments = { new EWallet(), new CreditCard() }; //  UPCASTING: EWallet & CreditCard disimpan sebagai tipe Payment

        System.out.println("===== UnpriShop Payment Gateway =====\n");

        int transaksi = 1;
        for (Payment p : payments) {
            System.out.println("--- Transaksi #" + transaksi + " ---");
            // Polymorphism
            p.process(100000);

            // Downcasting
            if (p instanceof EWallet) {
               EWallet ew = (EWallet) p; //  DOWNCASTING: Payment dikembalikan ke bentuk asli EWallet
                ew.inputPin();
            }
            transaksi++;
            System.out.println();
        }

        System.out.println("===== Semua Transaksi Selesai =====\n");

        // Demo Overloading
        System.out.println("--- Demo Overloading (promo code) ---");
        processPayment(50000, "DISKON50");
    }

    // Method Overloading
    public static void processPayment(int amount) {
        System.out.println("Memproses pembayaran: Rp " + amount);
    }

    public static void processPayment(int amount, String promoCode) {
        System.out.println("Memproses pembayaran: Rp " + amount 
                           + " dengan diskon kode " + promoCode);
    }
}