// EWallet adalah ANAK dari Payment (extends = mewarisi)
public class EWallet extends Payment {
    
    // @Override = menimpa method process dari induk Payment
    // Jadi kalau EWallet pakai process(), yang jalan versi ini
    @Override
    public void process(int amount) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp " 
        + amount + "... Suksess!");
    }
    
    // Method KHUSUS milik EWallet saja, Payment tidak punya ini
    public void inputPin() {
        System.out.println("Memasukkan 6 digit PIN E-Wallet...");
    }
}