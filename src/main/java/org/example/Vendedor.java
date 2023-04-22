package org.example;

public class Vendedor {
    private String code, name;
    private char sex;
    private float totalSales;

    public Vendedor() {
    }

    public Vendedor(String pCode, String pName, char pSex, float pTotalSales) {
        code = pCode;
        name = pName;
        sex = pSex;
        totalSales = pTotalSales;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public float getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(float totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "codigo='" + code + '\'' +
                ", nombre='" + name + '\'' +
                ", sexo=" + sex +
                ", totalVentas=" + totalSales +
                '}';
    }
}
