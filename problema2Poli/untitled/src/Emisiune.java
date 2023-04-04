public enum Emisiune {
    DESENE,
    SPORT,
    STIRI,
    POLITICA;

    private String nume;
    private double durata;


    Emisiune(String nume, double durata) {
        this.nume = nume;
        this.durata = durata;
    }

    Emisiune() {

    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }




}
