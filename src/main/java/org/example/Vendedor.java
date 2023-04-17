package org.example;

public class Vendedor {
    private String codigo, nombre;
    private char sexo;
    private float totalVentas;

    public Vendedor() {
    }

    public Vendedor(String pCodigo, String pNombre, char pSexo, float pTotalVentas) {
        codigo = pCodigo;
        nombre = pNombre;
        sexo = pSexo;
        totalVentas = pTotalVentas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", totalVentas=" + totalVentas +
                '}';
    }
}
