public class Adult extends Telespectator{

    public Adult() {
    }

    public Adult(int age, String name) {
        super(age, name);
    }

    @Override
    void evalueazaEmisiune(Emisiune emisiune){
        if(emisiune == Emisiune.SPORT || emisiune == Emisiune.STIRI){
            System.out.println("Imi place");
        }else if(emisiune == Emisiune.DESENE){
            System.out.println("Nu imi place");
        }else {
            System.out.println("Meh");
        }

    }
}
