package tallerBancogrupo14;

public class cuentaAhorro extends cuentaBancaria {

    private double tasaInteresMensual;
    private double saldoMinimo;

    public cuentaAhorro(String numeroCuenta, String titular, double saldo, double tasaInteresMensual, double saldoMinimo) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String describir(){
        return super.describir() + " | Tasa mensual: " + tasaInteresMensual + "%";
    }

    @Override
    public double calcularComision() {
        return (getSaldo() >= saldoMinimo) ? 0.0 : 12000.0;
    }

    public void realizarRetiro(double monto, boolean esUrgente){
        double nuevoSaldo = getSaldo() - monto;

        if(esUrgente && nuevoSaldo < saldoMinimo) {
            nuevoSaldo -= calcularComision();
        }

        setSaldo(nuevoSaldo);
    }

    public double calcularInteresDelMes(){
        return getSaldo() * tasaInteresMensual / 100;
    }
}
