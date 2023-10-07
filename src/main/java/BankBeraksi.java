public class BankBeraksi {
    public static void main(String[] args) {
        Bank m = new Bank();
        m = new Bank(100000);

        System.out.println("\tSelamat Datang di SPIDEY BANK");
        System.out.println("Saldo saat ini: Rp." + m.getSaldo());
        System.out.println();
        m.simpanUang(500000);
        System.out.println("Saldo saat ini: Rp." + m.getSaldo());
        System.out.println();
        m.ambilUang(150000);
        System.out.println("Saldo saat ini: Rp." + m.getSaldo());
    }
}
