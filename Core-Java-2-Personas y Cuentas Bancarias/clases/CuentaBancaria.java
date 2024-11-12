package clases;

import java.util.ArrayList;


public class CuentaBancaria {
    // Atributos privados
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    // Atributo estático para llevar el control de todas las cuentas creadas
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    // Constructor
    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = (int) (Math.random() * 1000000); // Genera un número de cuenta aleatorio de 6 dígitos
        listaDeCuentasBancarias.add(this); // Agrega la cuenta a la lista de cuentas
    }

    // Métodos getter y setter
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

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    // Métodos de operaciones bancarias
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto de deposito inválido.");
        }
    }

    public void retirar(double monto) {
        if (monto <= saldo && monto > 0) {
            saldo -= monto;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto invalido.");
        }
    }

    // Método que despliega la información de la cuenta
    public void despliegaInformacion() {
        System.out.println("Numero de cuenta: " + numeroCuenta);
        titular.despliegaInformacion();
        System.out.println("Saldo: " + saldo);
    }

    // Método estático para imprimir la información de todas las cuentas
    public static void imprimeInformacionDeTodasLasCuentas() {
        System.out.println("--- Informacion de todas las cuentas ---");
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
            System.out.println("--------------------------------------");
        }
    }
}


