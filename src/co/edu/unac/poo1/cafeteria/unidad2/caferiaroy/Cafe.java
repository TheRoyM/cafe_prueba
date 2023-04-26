package co.edu.unac.poo1.cafeteria.unidad2.caferiaroy;

import java.util.ArrayList;

public class Cafe {
    private int id;
    private String variedad;
    private int tamahoBean;
    private double peso;

    public Cafe() {
    }

    public Cafe(int id, String variedad, int tamahoBean, double peso) {
        this.id = id;
        this.variedad = variedad;
        this.tamahoBean = tamahoBean;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public int getTamahoBean() {
        return tamahoBean;
    }

    public void setTamahoBean(int tamahoBean) {
        this.tamahoBean = tamahoBean;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "id=" + id +
                ", variedad='" + variedad + '\'' +
                ", tamahoBean=" + tamahoBean +
                ", peso=" + peso +
                '}';
    }
}
