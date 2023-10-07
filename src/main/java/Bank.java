public class Bank {
    private double saldo;

    public Bank(){
        saldo = 0;
    }
    public Bank(double saldo) {
        this.saldo = saldo;
    }
    public void simpanUang(double nominal){
        System.out.println("Simpan uang: Rp. " + nominal);
        saldo += nominal;
    }
    public void ambilUang(double nominal){
        System.out.println("Ambil uang: Rp. " + nominal);
        saldo -= nominal;
    }
    public double getSaldo() {
        return saldo;
    }
}