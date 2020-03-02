package app;

/**
 * Carro
 * liga
 * acelera
 * freia
 * pegaMarcha
 * abastecer;

 */
public class Carro {

    private String placa;
    private int ano;
    private String modelo;
    private String cor;
    private String chassi;
    private Boolean ligado = false;
    public  Motor motor = new Motor();


    public void acelera() {
        System.out.println("Acelerando...");
    }
    public void freia() {
        System.out.println("Freiando...");
    }
    public void abastecer() {
        System.out.println("Abastecendo...");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }


    public void liga() {
        this.ligado = true;
    }

    public Boolean statusCarro() {
        return ligado;
    }

    //@Override
    public String toString() {
    return "Carro [Modelo: " + modelo + " - Ano: "+ ano + " - Cor: " + cor + " - Chassi=" + chassi + " -  placa=" + placa
                + " -> Está "+ (ligado ? "Ligado":"Desligado" )+"]\n"+
                "Motor [Km:"+ motor.getKilometragem()+" - Tipo Combustivel: "+motor.getCombustivel()
                + " - Status do Oleo: "+ (motor.getstatusOleo() ? "Já foi Trocado": "Não foi trocado")+"]";
    }
}