package calculadora;

import java.util.Scanner;

public class Calculadora {
    
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
       double a, b, result;
       char operador;
       
       do {
           System.out.println("\nMenu \n"
                   + "+\n"
                   + "-\n"
                   + "*\n"
                   + "/\n"
                   + "s para sair\n"
                   + "Digite a operação");
           operador = scan.next().charAt(0);
           
           System.out.println("Digite o primeiro número: ");
           a = scan.nextDouble();
           System.out.println("Digite o segundo número: ");
           b = scan.nextDouble();
           
           switch (operador) {
               case '+':
                   //result = a + b;
                   //System.out.println("Soma: " + result);
                   
                   //somar1();
                   
                   //result = somar2();
                   //System.out.println("Somar: " + result);
                   
                   somar3(a,b);
                           
                   break;
               
           }
       } while (operador != 's');
    }
    public static void somar1(){
        double a, b, result;
        System.out.println("Digite o primeiro número: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        b = scan.nextDouble();
        result = a + b;
        
        System.out.println("Soma: " + result);
    }
     public static double somar2(){
        double a, b, result;
        System.out.println("Digite o primeiro número: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        b = scan.nextDouble();
        result = a + b;
        return result;
    }
     public static void somar3(double x, double y){
        double result;
        result = x + y;
        System.out.println("Soma: " + result);
        
    }
}
