package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Viagem {


    private Veiculo veiculo;
    private LocalDate data = LocalDate.now();
    private double valor;
    private String origem;
    private String destino;

    public Viagem(Veiculo veiculo, double valor, String origem, String destino) {
        this.veiculo = veiculo;
        this.valor = valor;
        this.origem = origem;
        this.destino = destino;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
