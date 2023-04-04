public class Pensionar extends Telespectator{
    public Pensionar() {
    }

    public Pensionar(int age, String name) {
        super(age, name);
    }

    @Override
    void evalueazaEmisiune(Emisiune emisiune){
        if(emisiune == Emisiune.STIRI || emisiune == Emisiune.POLITICA){
            System.out.println("ADOR");
        }else {
            System.out.println("Nu imi place");
        }

    }
}
