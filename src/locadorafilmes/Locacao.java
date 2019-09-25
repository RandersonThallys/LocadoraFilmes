
package locadorafilmes;

import java.util.ArrayList;
import java.util.Date;
import locadorafilmes.Filme;

/**
 *
 * @author RandersonThallys
 */
public class Locacao {
    
    
  // Atributos (Variaveis)
    private Date data;
    private double valorTotalAPagar;
    private Filme listaFilmes;

    // Construtor
    public Locacao() {
        this.data = data;
        this.valorTotalAPagar = valorTotalAPagar;
        this.listaFilmes = listaFilmes;
    }

    // Acoes ou Metodos (Funcoes)
    public void Locacao() {

    }

    public void Locacao(Date data) {

    }

    public void addFilme(Filme filme) {
        listaFilmes = filme;
    }

    // Getters e Setters
    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotalAPagar() {
        return this.valorTotalAPagar;
    }

    public void setValorTotalAPagar(double valorTotalAPagar) {
        this.valorTotalAPagar = valorTotalAPagar;
    }
}
