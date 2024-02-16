package models;
public class MetodoDePago {
    private String nombre;
    private int dineroAportado;

    public MetodoDePago(String nombre, int dineroAportado) {
        this.nombre = nombre;
        this.dineroAportado = dineroAportado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDineroAportado() {
        return dineroAportado;
    }
    }
