package org.example;

public class NodoDobleVendedor {
    private Vendedor vendedor;
    private NodoDobleVendedor li, ld;

    public NodoDobleVendedor() {
    }

    public NodoDobleVendedor(Vendedor pVendedor) {
        vendedor = pVendedor;
        li = ld = null;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public NodoDobleVendedor getLi() {
        return li;
    }

    public void setLi(NodoDobleVendedor li) {
        this.li = li;
    }

    public NodoDobleVendedor getLd() {
        return ld;
    }

    public void setLd(NodoDobleVendedor ld) {
        this.ld = ld;
    }
}
