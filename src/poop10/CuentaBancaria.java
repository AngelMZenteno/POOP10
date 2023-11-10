/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author Angel Maurice Zenteno Loyola
 * Clase que simula una cuenta bancaria
 */
public class CuentaBancaria {
    private double saldo;
    /**
     * Indica que necesariamente la cuenta se incia siempre en ceros
     */
    public CuentaBancaria() {
        saldo=0;
    }
    /**
     * Imprime que esta depositando un monto a recibir del teclado
     * @param monto: Dinero que se deposita a la cuenta 
     */
    public void depositar(double monto){
        System.out.println("Depositando "+monto);
        saldo+=monto;
    }
    /**
     * Imprime que esta retirando un monto desde el teclado
     * @param monto: monto que se retira
     * @throws SaldoInsuficienteException
     * excepcion que lanza cuando el monto es mayor qu el saldo
     */
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando "+monto);
        if (saldo<monto)
            throw new SaldoInsuficienteException();
        else
            saldo -= monto;
    }
    /**
     * Método get Saldo
     * @return regresa el saldo que hay en ese momento en la cuenta
     */
    public double getSaldo(){
        return saldo;
    }
    
}
