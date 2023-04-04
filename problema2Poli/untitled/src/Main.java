

public class Main {
    public static void main(String[] args) {
        Adult adult1 = new Adult(45, "Ion");
        Copil copil1 = new Copil(12, "Adi");
        Pensionar pensionar1 = new Pensionar(76, "Vasile");

        Emisiune emisiune1 = Emisiune.DESENE;
        Emisiune emisiune2 = Emisiune.STIRI;
        Emisiune emisiune3 = Emisiune.SPORT;
        Emisiune emisiune4 = Emisiune.POLITICA;

        emisiune1.setDurata(2);
        emisiune2.setDurata(3);
        emisiune3.setDurata(2);
        emisiune4.setDurata(7);

        emisiune1.setNume("Duck TV");
        emisiune2.setNume("Digi24");
        emisiune3.setNume("DIGI SPORT");
        emisiune4.setNume("Antena 3");

        adult1.evalueazaEmisiune(emisiune1);
        copil1.evalueazaEmisiune(emisiune1);
        pensionar1.evalueazaEmisiune(emisiune4);

        ProgramTV programTV = new ProgramTV(12334, adult1, 5);
        programTV.adaugaEmisiune(emisiune1);
        programTV.adaugaEmisiune(emisiune2);
        programTV.adaugaEmisiune(emisiune3);
        programTV.adaugaEmisiune(emisiune4);

        programTV.afiseazaEmisiunile();
        programTV.stergeEmisiune(emisiune1);
        programTV.afiseazaEmisiunile();



    }
}