public class Copil extends Telespectator{
    public Copil() {
    }

    public Copil(int age, String name) {
        super(age, name);
    }

    @Override
    void evalueazaEmisiune(Emisiune emisiune){

        if(emisiune == Emisiune.DESENE){
            System.out.println("Imi place");
        }else if(emisiune == Emisiune.STIRI){
            System.out.println("Meh");
        }else if(emisiune == Emisiune.POLITICA){
            System.out.println("NU imi place");
        }else {
            if(emisiune.getDurata() < 2){
                System.out.println("Imi place");
            }else {
                System.out.println("NU imi place");
            }
        }
    }
}
