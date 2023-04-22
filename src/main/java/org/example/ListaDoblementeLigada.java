package org.example;

public class ListaDoblementeLigada {

    private NodoDobleVendedor head, last, iterator, nodeFound;
    private int totalNodes;
    private Vendedor sellerFound;

    public ListaDoblementeLigada() {
        head = new NodoDobleVendedor();
        iterator = last = head;
        totalNodes = 0;
    }

    public NodoDobleVendedor findByCode(String aCode) {
        nodeFound = null;
        iterator = head.getLd();
        while (iterator != null && nodeFound == null) {
            if (iterator.getVendedor().getCode().equals(aCode)) {
                nodeFound = iterator;
            } else {
                iterator = iterator.getLd();
            }
        }
        iterator = head;
        return nodeFound;
    }

    public String add(Vendedor vendedor) {
        NodoDobleVendedor newNode = new NodoDobleVendedor(vendedor);
        last.setLd(newNode);
        newNode.setLi(last);
        last = newNode;
        totalNodes++;
        return "El vendedor ha sido creado satisfactoriamente!";
    }

    public String removeByCode(String code) {
        nodeFound = findByCode(code);
        if (nodeFound == last) {
            nodeFound.getLi().setLd(null);
            last = nodeFound.getLi();
        } else {
            nodeFound.getLd().setLi(nodeFound.getLi());
            nodeFound.getLi().setLd(nodeFound.getLd());
        }
        totalNodes--;
        return "El vendedor ha sido eliminado de la lista! ";
    }

    public Vendedor traverseRight() {
        iterator = iterator.getLd();
        if (iterator == null) {
            iterator = head;
        }
        return iterator.getVendedor();
    }

    public Vendedor traverseLeft() {
        if (iterator == head) {
            iterator = last;
            return iterator.getVendedor();
        }
        iterator = iterator.getLi();
        return iterator.getVendedor();
    }

    public String averageSales() {
        float totalSale = 0f;
        Vendedor seller = traverseRight();
        while (seller != null) {
            totalSale += seller.getTotalSales();
            seller = traverseRight();
        }
        return String.format("%,.2f", (totalSale / totalNodes));
    }

    public Vendedor topSellingByGender(char gender) {
        sellerFound = null;
        Vendedor seller = traverseRight();
        while (seller != null) {
            if (seller.getSex() == gender) {
                if (sellerFound == null || (seller.getTotalSales() > sellerFound.getTotalSales())) {
                    sellerFound = seller;
                }
            }
            seller = traverseRight();
        }
        return sellerFound;
    }

    public Vendedor lessSellingByGender(char gender) {
        sellerFound = null;
        Vendedor seller = traverseRight();
        while (seller != null) {
            if (seller.getSex() == gender) {
                if (sellerFound == null || (seller.getTotalSales() < sellerFound.getTotalSales())) {
                    sellerFound = seller;
                }
            }
            seller = traverseRight();
        }
        return sellerFound;
    }

    public int totalSellersByGender(char gender) {
        int counter = 0;
        Vendedor seller = traverseRight();
        while (seller != null) {
            if (seller.getSex() == gender) {
                counter++;
            }
            seller = traverseRight();
        }
        return counter;
    }

}
