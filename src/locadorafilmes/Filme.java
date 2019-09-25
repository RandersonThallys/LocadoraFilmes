
package locadorafilmes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author RandersonThallys
 */
public class Filme {
    
    
 Scanner entrada = new Scanner(System.in);

    List<Filme> listaFilme = new ArrayList<Filme>();

    private String titulo;
    private int ano;
    private String genero;
    private double valorLocacao;

    public Filme() {

        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.valorLocacao = valorLocacao;
    }



    //Acoes ou Metodos (Funcoes)
    public void cadastraFilme() {
        Filme filme = new Filme();
        System.out.println("===== CADASTRAR FILME =====");

        System.out.println("TITULO: ");
        filme.setTitulo(entrada.nextLine());

        System.out.println("GENERO: ");
        filme.setGenero(entrada.nextLine());

        System.out.println("ANO: ");
        filme.ano = Integer.parseInt(entrada.nextLine());

        System.out.println("VALOR DA LOCACAO: ");
        filme.valorLocacao = Double.parseDouble(entrada.nextLine());

        listaFilme.add(filme);
    }

    
    public void pesquisaFilme() {

        String titulo;
        boolean resul;

        System.out.println("DIGITE O NOME DO FILME: ");

        titulo = entrada.nextLine(); 

        for (Filme filme : listaFilme) {
            if (filme.getTitulo().equals(titulo)) {
                System.out.println("Nome: "+ filme.getTitulo() + " | " + "Genero: " + filme.getGenero());
                return;
            }
        }
        System.out.println("FILME NAO ENCONTRADO.");
    }
    
    
    
    public void locaFilme() {
        

        String nomeFilme;

        Cliente cliente = new Cliente();

        System.out.println("===== LOCAR FILME =====\n");
        System.out.println("DIGITE O NOME DO FILME DESEJADO: ");
        nomeFilme = entrada.nextLine();

        for (Filme filme : listaFilme) {
            if (filme.getTitulo().equals(nomeFilme)) {
                System.out.println(".::: A PESQUISA ENCONTROU :::." + 
            "\n TITULO: " + getTitulo() + 
            "\n ANO: " + getAno() + 
            "\n GENERO: " + getGenero() + 
            "\n VALOR: " + getValorLocacao());

            }
        }
        System.out.println("FILME NAO ENCONTRADO.");

        if (!("FILME NAO ENCONTRADO".equals(nomeFilme))) {

            System.out.println("DESEJA REALMENTE LOCAR ESTE FILME? ");
            String opcao = null;

            switch (opcao) {
            case "s":
            case "S":
                System.out.println("DIGITE O CPF DO CLIENTE: ");
                String cpfCliente = entrada.nextLine();

                for (Cliente pcliente : cliente.listaCliente) {
                    if (cliente.getCpf().equals(cliente.getCpf())) {
                        System.out.println(".::: A PESQUISA ENCONTROU :::." + 
                    "\n NOME: " + cliente.getNome() + 
                    "\n CPF: " + cliente.getCpf() + 
                    "\n ENDERECO: " + cliente.getEndereco() + 
                    "\n TELEFONE: " + cliente.getTelefone());

                    }
                }
                System.out.println("CLIENTE NAO ENCONTRADO.");

                if (!("CLIENTE NAO ENCONTRADO.".equals(cpfCliente))) {


                }

                break;

            case "n":
            case "N":


            default:
                System.out.println("APERTE APENAS S PARA SIM OU N PARA NAO.");
                break;
            }

        }
    }


    // Getters e Setters    
    public void setListaFilme(List<Filme> listaFilme) {
        this.listaFilme = listaFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
}