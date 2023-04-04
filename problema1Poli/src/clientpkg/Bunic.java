package clientpkg;

import productpkg.Produs;

public class Bunic extends Client {

    // constructor
    public Bunic() {
    }

    public Bunic(int age, double budget, String name){
        this.setAge(age);
        this.setBudget(budget);
        this.setName(name);
    }

    @Override
    public boolean canBuy(Produs produs){
        return produs.stillInStock() && (this.getBudget() - produs.getPret()) > 99;
    }

    @Override
    public String cumparaProdus(Produs produs){
        if(canBuy(produs)) {
            produs.setStockAfterClientBuysProduct(produs);
            return "Clientul " + this.getName() + " doreste sa cumpere produsul " + produs.toString() + "  (stoc ramas produs  "+ produs.getStock() + " )";
        }else {
            if((this.getBudget() - produs.getPret()) < 100){
                return "bugetul scade sub 100 Ron";
            }else {
                return "Produsul nu mai este in stoc";
            }
        }

    }
}
