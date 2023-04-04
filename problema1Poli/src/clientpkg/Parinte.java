package clientpkg;

import productpkg.Produs;

public class Parinte extends Client{

    // constructor
    public Parinte() {
    }

    public Parinte(int age, double budget, String name){
        this.setAge(age);
        this.setBudget(budget);
        this.setName(name);
    }


    @Override
    public boolean canBuy(Produs produs){
        return produs.stillInStock() && produs.getPret() < 500;
    }
    @Override
    public String cumparaProdus(Produs produs){
        if(produs.stillInStock() && produs.getPret() < 500 ) {
            produs.setStockAfterClientBuysProduct(produs);
            return "Clientul " + this.getName() + " doreste sa cumpere produsul " + produs.toString() + "  (stoc ramas produs  "+ produs.getStock() + " )";
        }else {
            if(produs.stillInStock()){
                return "Produsul depasesete bugetul de 500";
            }else {
                return "Produsul nu mai este in stoc";
            }
        }

    }
}
