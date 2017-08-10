package pe.com.ricindigus.androidxml;

import java.text.NumberFormat;

/**
 * Created by RICARDO on 10/08/2017.
 */

public class Producto{
    String nombre;
    int cantidades;

    public Producto(){}

    public Producto(String nombre, int cantidades) {
        this.nombre = nombre;
        this.cantidades = cantidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidades() {
        return cantidades;
    }

    public void setCantidades(int cantidades) {
        this.cantidades = cantidades;
    }

    public String toString(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nombre + "\n(" + nf.format(cantidades) + ")";
    }
}
