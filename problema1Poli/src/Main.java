import clientpkg.*;
import productpkg.*;


public class Main {
    public static void main(String[] args) {


        Copil copil1 = new Copil(9, 300, "Emil");
        System.out.println(copil1);

        Parinte parinte1 = new Parinte(40, 3000.56, "John");
        System.out.println(parinte1);

        Produs produs1 = Produs.JUCARIE;
        System.out.println(copil1.cumparaProdus(produs1));
//
        Produs produs2 = Produs.ELECTROCASNIC;
        System.out.println(parinte1.cumparaProdus(produs2));
        System.out.println(parinte1.cumparaProdus(produs2));
//
        Produs produs4 = Produs.MANCARE;
        Bunic bunic1 = new Bunic(62, 700, "Octavian");
        System.out.println(bunic1.cumparaProdus(produs4));
        System.out.println(bunic1.cumparaProdus(produs4));

        System.out.println(copil1.cumparaProdus(produs2));

        Comanda comanda1 = new Comanda();
        comanda1.adaugareProdus(parinte1, produs1);
        comanda1.adaugareProdus(parinte1, produs2);
        comanda1.adaugareProdus(parinte1, produs4);
        comanda1.afisareComanda();
        comanda1.stergeProdus(produs1);
        comanda1.afisareComanda();
        comanda1.totalComanda();

    }
}