package app;

/**
 * Motor
 */
public class Motor {

    private Boolean statusOleo = false;
    private String combustivel;
    private int kilometragem;

    public void trocaOleo() {
        statusOleo = true;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }
    
    public Boolean getstatusOleo() {
        return statusOleo;
    }

}