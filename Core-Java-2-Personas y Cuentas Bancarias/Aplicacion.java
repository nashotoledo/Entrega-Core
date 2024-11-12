import clases.Persona;
import clases.CuentaBancaria;

public class Aplicacion {

    public static void main(String[] args) {
        // Crear instancias de la clase Persona
        Persona persona1 = new Persona("Juan Perez", 30);
        Persona persona2 = new Persona("Maria Gomez", 25);
        Persona persona3 = new Persona("Carlos Martinez", 40);

        // Crear instancias de la clase CuentaBancaria asociadas a las personas
        CuentaBancaria cuenta1 = new CuentaBancaria(5000.0, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(10000.0, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(1500.0, persona3);

        // Realizar operaciones de depósito y retiro en las cuentas
        System.out.println("----- Movimientos de las Cuentas -----");
        cuenta1.depositar(2000.0);
        cuenta2.retirar(500.0);
        cuenta3.depositar(300.0);
        cuenta3.retirar(100.0);
        System.out.println("--------------------------------------");

        // Imprimir el saldo actual de cada cuenta bancaria después de las operaciones
        System.out.println("--- Saldo Actual de las Cuentas ---");
        System.out.println("Saldo de la cuenta de " + persona1.getNombre() + ": " + cuenta1.getSaldo());
        System.out.println("Saldo de la cuenta de " + persona2.getNombre() + ": " + cuenta2.getSaldo());
        System.out.println("Saldo de la cuenta de " + persona3.getNombre() + ": " + cuenta3.getSaldo());
        System.out.println("--------------------------------------");

        // Imprimir la información de todas las cuentas bancarias
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}