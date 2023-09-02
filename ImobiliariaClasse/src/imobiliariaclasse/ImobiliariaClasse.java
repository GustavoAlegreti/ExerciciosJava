
package imobiliariaclasse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gustavo Alegreti e Derek William
 */
public class ImobiliariaClasse {

    public static void main(String[] args) throws FileNotFoundException {
        File arq = new File("Dados");
        
        Imovel imo[] = new Imovel[8];
        for (int i = 0; i < imo.length; i++) {
            imo[i] = new Imovel();
        } 
        
        System.out.println("teste" + imo[2].aluguelBase);
       
       // Scanner scan = new Scanner(arq);
    }
}
