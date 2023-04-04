package clientpkg;
import productpkg.*;

public abstract class Client {

    // fields
    private String name;
    private int age;
    private double budget;



    // setters
    public void setBudget(double budget){
        this.budget = budget;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // getters
    public double getBudget(){
        return budget;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }


    public String toString(){
        return " name: " + this.name + " age: " + this.age + " budget: " + this.budget;
    }

    public boolean stillHasBudget(Produs produs){
        return this.budget > produs.getPret() ;
    }

    public boolean canBuy(Produs produs) {
        return produs.stillInStock();
    }

    public String cumparaProdus(Produs produs){
        if(canBuy(produs)) {
            produs.setStockAfterClientBuysProduct(produs);
            return "Clientul " + this.getName() + " doreste sa cumpere produsul " + produs.toString() + "  (stoc ramas produs  "+ produs.getStock() + " )";
        }else {
            return "Produsul nu mai este in stoc";
        }

    }



}
