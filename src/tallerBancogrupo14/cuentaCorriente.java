package tallerBancogrupo14;

public class cuentaCorriente extends cuentaBancaria {

    private double comisionPorTransaccion;
    private double limiteSobregiro;

    public cuentaCorriente(String numeroCuenta, String titular, double saldo, double comisionPorTransaccion, double limiteSobregiro) {
        super(numeroCuenta, titular, saldo);
        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public String describir() {
        return super.describir() + " | Comision por transacción: $" + comisionPorTransaccion;
    }

    @Override
    public double calcularComision() {
        return comisionPorTransaccion;
    }

    @Override
    public void realizarRetiro(double monto){
        double nuevoSaldo = getSaldo() - monto - comisionPorTransaccion;

        if(nuevoSaldo < -limiteSobregiro) {
            System.out.println("Retiro no permitido: supera el limite de sobregiro");
        } else {
            setSaldo(nuevoSaldo);
        }
    }
}
