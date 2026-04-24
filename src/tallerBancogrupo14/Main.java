package tallerBancogrupo14;

public class Main {

    public static void main(String[] args) {

        cuentaBancaria cuenta1 = new cuentaAhorro("001", "Juan Castro", 2000000, 2.5, 500000 );
        cuentaBancaria cuenta2 = new cuentaCorriente("002", "Brayan Castro S.A.S", 3000000, 8000, 500000);
        cuentaBancaria cuenta3 = new cuentaInversion("003", "Ryan Castro", 5000000, 8.0 ,12, 50000);

        System.out.println("======================================");
        System.out.println("Descripcion de cuentas");
        System.out.println("======================================");
        System.out.println("Ahorro: " + cuenta1.describir());
        System.out.println("Corriente: " + cuenta2.describir());
        System.out.println("Inversion: " + cuenta3.describir());

        System.out.println("======================================");
        System.out.println("Descripcion de Comisiones");
        System.out.println("======================================");
        System.out.println("ComisionCuenta1: $" + cuenta1.calcularComision());
        System.out.println("ComisionCuenta2: $" + cuenta2.calcularComision());
        System.out.println("ComisionCuenta3: $" + cuenta3.calcularComision());

        System.out.println("======================================");
        System.out.println("Descripcion de saldos Finales");
        System.out.println("======================================");
        cuenta1.realizarRetiro(500000);
        cuenta2.realizarRetiro(500000);
        cuenta3.realizarRetiro(500000);

        System.out.println("SaldoCuenta1: $" + cuenta1.getSaldo());
        System.out.println("SaldoCuenta2: $" + cuenta2.getSaldo());
        System.out.println("SaldoCuenta3: $" + cuenta3.getSaldo());

    }
    //usar cuenta bancaria como tipo de variable nos permitio aplicar polimorfismo, ya que una misma referencia puede apuntar a diferentes tipos de cuentas o clases(ejemplo los tipos de cuentas)
    //como gran ventaja no necesitamos saber el tipo especifico para ejecutar el comportamiento correcto, porque gracias a los multiples hilos de java lo decide en el mismo tiempo de ejecucion.
}