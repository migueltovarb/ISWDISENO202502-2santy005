public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona titular;

    public Cuenta(String numeroCuenta, double saldo, Persona titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta[numeroCuenta=" + numeroCuenta + ",saldo=" + saldo + ",titular=" + titular + "]";
    }
}