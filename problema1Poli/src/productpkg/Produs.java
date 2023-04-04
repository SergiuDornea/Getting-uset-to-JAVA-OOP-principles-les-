package productpkg;

public enum Produs {
    JUCARIE(1, 15.50),
    ELECTROCASNIC(1, 200),
    MANCARE(1, 100);


    private int stoc;
    private double pret;
    Produs(int stoc, double pret) {
        this.stoc = stoc;
        this.pret = pret;
    }




    public String toString(){
        return switch (this) {
            case JUCARIE -> "jucarie in valoare de " + JUCARIE.getPret() + " RON";
            case ELECTROCASNIC -> "electrocasnic in valoare de" + ELECTROCASNIC.getPret() + " RON";
            case MANCARE -> "mancare in valoare de " + MANCARE.getPret() + " RON";
            default -> null;
        };
    }
    public double getPret() {

        return switch (this) {
            case JUCARIE -> JUCARIE.pret;
            case ELECTROCASNIC -> ELECTROCASNIC.pret;
            case MANCARE -> MANCARE.pret;
            default -> 0;
        };


    }
    public int getStock() {

        return switch (this) {
            case JUCARIE -> JUCARIE.stoc;
            case ELECTROCASNIC -> ELECTROCASNIC.stoc;
            case MANCARE -> MANCARE.stoc;
            default -> 0;
        };
    }

    public boolean stillInStock(){
        return getStock() > 0;
    }



    public int setStockAfterClientBuysProduct(Produs produs) {

        return switch (this) {
            case JUCARIE -> JUCARIE.stoc -= 1;
            case ELECTROCASNIC -> ELECTROCASNIC.stoc -= 1;
            case MANCARE -> MANCARE.stoc -= 1;
            default -> 0;
        };
    }
}
