/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author Angel Maurice Zenteno Loyola
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        try{
                String mensajes[]={"Primer elemento","Segundo elemento","Tercer elemento"};
            for (int i=0; i<=3; i++){
                System.out.println(mensajes[i]);    
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera del rango del arreglo");
            System.out.println(e.getMessage());
        }
        
        System.out.println("Hola mundo 2"); 
        /**
         * Excepcion aritmetica
         */
        try{
            double equis = 5.0/0;
            System.out.println("Equis="+equis);
        } catch (ArithmeticException e){
            System.out.println("Error división entre cero");
            System.out.println(e.getMessage());
        }
        /**
         * Uso de la palabra resevada finally y varios bloques catch
         */
         try{
            double equis = 0/0;
            System.out.println("Equis="+equis);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera del rango del arreglo");
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Error división entre cero");
            System.out.println(e.getMessage());
        }catch  (Exception e){
            System.out.println("Error: excepción general");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("A pesar de todo, se ejecuta el bloque finally");
        }
        
        try{
            double equis = 0/0;
            System.out.println("Equis="+equis);
        } catch (ArithmeticException e){
            System.out.println("Error división entre cero");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        /**
         * Propagacion de excepciones
         */
        System.out.println("Hola Mundo 3");
        try{
            double division= metododivision(4f,0.0);
            System.out.println(division);
        } catch (ArithmeticException e){
            System.out.println("Excepción aritmetica arrojada: ");
            e.printStackTrace();
        }
        
        /**
         *  Clase cajero
         */
        CuentaBancaria cuenta= new CuentaBancaria();
        try{
            cuenta.depositar(2000);
            cuenta.retirar(1000);
            System.out.println( cuenta.getSaldo());
            cuenta.retirar(1000);
            System.out.println( cuenta.getSaldo());
            cuenta.retirar(1000);
            System.out.println( cuenta.getSaldo());
            cuenta.depositar(200);
            cuenta.retirar(100);
        } catch (SaldoInsuficienteException e){
            e.printStackTrace();
        }
        
    }

    private static double metododivision(float f, double d) throws ArithmeticException{
        if (d==0){
            throw new ArithmeticException();
        }
        double c= f/d;
        return c;
    }

    
}
