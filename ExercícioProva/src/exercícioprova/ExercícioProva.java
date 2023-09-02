package exercicioprova;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ExercicioProva {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
                
        Produto prod[] = new Produto[5];
        lerDados(prod);
        
        int opcao;
        
        do {
              System.out.println("Menu\n" +
                                 "1 - Exibir os dados\n" +
                                 "2 - Realizar compra\n" +
                                 "3 - Sair\n" +
                                 "Digite a opcao desejada:");
                                 opcao = scan.nextInt();
                                 switch(opcao){
                                     case 1:
                                         exibirDados(prod);
                                         break;
                                     case 2:
                                         int cod, qtd;
                                         System.out.println("Digite o codigo");
                                         cod = scan.nextInt();
                                         System.out.println("Digite a quantidade");
                                         qtd = scan.nextInt();
                                         atualizarEstoque(prod, cod, qtd);
                                         break;
                                     case 3:
                                         System.out.println("Encerrando");
                                         break;
                                     default:
                                         System.out.println("Valor invalido");
                                         break;
                                 }
        } while (opcao != 3);
        
    }
    public static String atualizarEstoque(Produto prod[], int cod, int qtd){
        for (int i = 0; i < prod.length; i++) {
            if (cod == prod[i].cod) {
                prod[i].estoque = prod[i].estoque + qtd;
            }
        }
        return "Entrada efetuada";
    }
    public static void lerDados(Produto prod[]) throws FileNotFoundException{
            File arq = new File("dados");
            Scanner scan = new Scanner(arq);
            
            for (int i = 0; i < prod.length; i++) {
                prod[i] = new Produto(scan.nextInt(), scan.next(), 
                                      scan.nextInt(), scan.nextDouble());
                
            }
            
    }
    public static void exibirDados(Produto prod[]) {
        for (int i = 0; i < prod.length; i++) {
            System.out.printf("%10d %10s %10d %10.2f\n",
                    prod[i].cod, prod[i].descricao,
                    prod[i].estoque, prod[i].precoCompra);
        }
 
    }
}