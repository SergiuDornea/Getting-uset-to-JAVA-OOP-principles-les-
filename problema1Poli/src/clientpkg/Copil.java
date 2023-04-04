package clientpkg;

import productpkg.Produs;

public class Copil extends Client{


  // constructor
    public Copil() {
    }

    public Copil(int age, double budget, String name){
        this.setAge(age);
        this.setBudget(budget);
        this.setName(name);
    }

    @Override
    public boolean canBuy(Produs produs){
        return this.getAge() < 10 && stillHasBudget(produs) && produs != Produs.ELECTROCASNIC;
    }


    @Override
    public String cumparaProdus(Produs produs){
        if(canBuy(produs)){
            return "Clientul " + this.getName() + " doreste sa cumpere produsul "+ produs.toString()  + "  (stoc ramas produs  "+ produs.getStock() + " )";
        }else {
            if(produs == Produs.ELECTROCASNIC){
                return "Copiii nu au voie sa cumpere electrocasnice";
            }else {
                return "Nu sunt indeplinite conditiile";
            }
        }

    }
}

