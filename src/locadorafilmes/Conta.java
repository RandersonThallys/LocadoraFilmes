
package locadorafilmes;

import java.util.ArrayList;
import locadorafilmes.Locacao;
import locadorafilmes.Cliente;
import locadorafilmes.Filme;

/**
 *
 * @author RandersonThallys
 */
public class Conta {
    
// Atributos (Variaveis)
    private Cliente cliente;
    private String numero;
    private double saldoDevedor;
    private Locacao[] historicoLocacao;

    // Construtor
    public Conta() {

        this.cliente = cliente;
        this.numero = numero;
        this.saldoDevedor = saldoDevedor = 0;
        this.historicoLocacao = new Locacao[20];
    }
    
    public ArrayList<Conta> listaCliente = new ArrayList<Conta>();

    // Metodos (Acoes ou Funcoes)
    public void Conta() {

    }

    public void Conta(Cliente cliente, int numero) {

    }

    public void locarFilmes(Filme filme) {

    }

    public String extratoHistorico() {
            return extratoHistorico();

    }

    public void pagarDebito(double valor) {

    }


    // Getters e Setters
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldoDevedor() {
        return this.saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;

    }

    public Locacao[] getHistoricoLocacao() {
        return historicoLocacao;
    }

    public void setHistoricoLocacao(Locacao[] historicoLocacao) {
        this.historicoLocacao = historicoLocacao;
    }


}