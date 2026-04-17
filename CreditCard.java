// CreditCard juga anaknya Payment, sama kayak EWallet
public class CreditCard extends Payment {
    
    // Timpa juga method process dari induk
    // Tapi pesannya beda, versi kartu kredit
    @Override
    public void process(int amount) {
        // Tampilin pesan khusus versi CreditCard
        System.out.println("Menghubungi Bank... Memotong Kartu Kredit Rp " 
        + amount + "... Suksess!");
    }
}