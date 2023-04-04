public class Telespectator {
    private int age;
    private String name;

    public Telespectator(){

    }
    public Telespectator(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void evalueazaEmisiune(Emisiune emisiune){
        System.out.println("Telespectatorul " + this.getName() + " nu stie ce sa spuna despre emisiunea " + emisiune.name());
    }


}
