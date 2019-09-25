
package locadorafilmes;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author RandersonThallys
 */
public class Cliente {
    

    // Atributos (Variaveis)
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    // Construtor
    public Cliente() {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    Scanner entrada = new Scanner(System.in);

    public ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    // Metodos (Acoes ou Funcoes)
    public void cadastraCliente() {

        Cliente cliente = new Cliente();

        System.out.println("===== CADASTRAR CLIENTE =====");

        System.out.println("NOME: ");
        cliente.setNome(entrada.nextLine());

        System.out.println("CPF: ");
        cliente.setCpf(entrada.nextLine());

        System.out.println("ENDERECO: ");
        cliente.setEndereco(entrada.nextLine());

        System.out.println("TELEFONE: ");
        cliente.setTelefone(entrada.nextLine());

        listaCliente.add(cliente);

    }

    public void pesquisaCliente() {

        String cpf;
        boolean resul;

        System.out.println("DIGITE O CPF: ");

        cpf = entrada.nextLine(); 

        for (Cliente cliente : listaCliente) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente: "+ cliente.getNome() + " | " + "CPF: " + cliente.getCpf());
                return;
            }
        }
        System.out.println("CLIENTE NAO ENCONTRADO.");
    }

    public void excluiCliente() {

        String cpf;
        String decisao = null;

        System.out.println("DIGITE O CPF: ");
        cpf = entrada.nextLine();

        for (Cliente cliente : listaCliente) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente: "+ cliente.getNome() + " | " + "CPF: "+cliente.getCpf());
            }
        }

        System.out.println("DESEJA REALMENTE APAGAR ESTE CLIENTE? ");
        decisao = entrada.nextLine();

        if (decisao == "s") {
            listaCliente.remove(cpf);
        }
        else {
            return;
        }


        return;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}