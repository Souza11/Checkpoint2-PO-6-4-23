package entities;

public class Veiculo {

    private Motorista motorista;
    private String Placa;
    private String modelo;
    private String montadora;
    private int ano;

    @Override
    public String toString() {
        return "Dados Veiculo: " +
                " Placa='" + Placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", montadora='" + montadora + '\'' +
                ", ano=" + ano + '\'' + "; "
                 + motorista.toString();
    }

    public Veiculo(Motorista motorista, String placa, String modelo, String montadora, int ano) {
        this.motorista = motorista;
        Placa = placa;
        this.modelo = modelo;
        this.montadora = montadora;
        this.ano = ano;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
