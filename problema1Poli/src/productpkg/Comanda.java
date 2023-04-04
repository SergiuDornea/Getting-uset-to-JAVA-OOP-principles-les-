package productpkg;
import clientpkg.*;

import java.util.ArrayList;

public class Comanda {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public int getNrMaxProduse() {
        return nrMaxProduse;
    }

    public void setNrMaxProduse(int nrMaxProduse) {
        this.nrMaxProduse = nrMaxProduse;
    }

    private int id;
    private String clientName;
    public ArrayList<Produs> sirDeProduse = new ArrayList<Produs>();
    private int nrMaxProduse;


    public void adaugareProdus(Client client, Produs produs){
        if(client.canBuy(produs)){
            sirDeProduse.add(produs);
            System.out.println("Clientul " + client.getName() + " a adaugat produsul " + produs + " la comanda");
        }else {
            System.out.println("Produsul nu poate fi adaugat in cos");
        }


    }

    public void stergeProdus(Produs produs){
        this.sirDeProduse.remove(produs);
        System.out.println("Produs sters din lista");
    }


    public void afisareComanda(){
        System.out.println("Produse curente comanda : ");
        for(Produs i: this.sirDeProduse){
            System.out.println(i );
        }
    }



    public void totalComanda(){
        double sum = 0;
        for(Produs i: this.sirDeProduse){
            sum += i.getPret();
        }
        System.out.println("Total comanda : " + sum);
    }
}
