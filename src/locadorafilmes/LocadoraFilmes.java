
package locadorafilmes;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import locadorafilmes.Conta;
import locadorafilmes.Filme;
/**
 *
 * @author RandersonThallys
 */
public class LocadoraFilmes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
            Cliente cliente = new Cliente();
            Filme filme = new Filme();

            int menu = 0;
            int opcao = 0;

            do {
                System.out.println("===== LOCADORA DE FILME =====");
                System.out.println("1 - CADASTRAR CLIENTE");
                System.out.println("2 - PESQUIZAR CLIENTE");
                System.out.println("3 - APAGAR CLIENTE");
                System.out.println("4 - CADASTRAR FILME");
                System.out.println("5 - PESQUISA FILMES");
                System.out.println("6 - LOCAR FILME");
                System.out.println("7 - HISTORICO  FILMES");
                opcao = entrada.nextInt();

                switch (opcao) {

                    case 1:
                        cliente.cadastraCliente();
                        break;

                    case 2:
                        cliente.pesquisaCliente();
                        break;

                    case 3:
                        cliente.excluiCliente();
                        break;

                    case 4:
                        filme.cadastraFilme();
                        break;
                        
                   case 5:;
                        filme.pesquisaFilme();
                        break; 
                       
                       case 6:;
                        filme.locaFilme();
                        break; 
                           
                       case 7:;
                        filme.locaFilme();
                        break; 

                    default:
                        System.out.println("Opcao invalida.");
                        break;
                }            
            } while (menu == 0);}
    
}
