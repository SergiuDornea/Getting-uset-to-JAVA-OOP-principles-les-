import java.util.ArrayList;

public class ProgramTV {

    private int id;

    public ProgramTV(int id, Telespectator telespectator, int maxEmisiuni) {
        this.id = id;
        this.telespectator = telespectator;
        this.maxEmisiuni = maxEmisiuni;
    }

    private Telespectator telespectator;
    private  int maxEmisiuni;
    public ArrayList<Emisiune> tablouDeEmisiuni = new ArrayList<Emisiune>(maxEmisiuni);


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Telespectator getTelespectator() {
        return telespectator;
    }

    public void setTelespectator(Telespectator telespectator) {
        this.telespectator = telespectator;

    }

    public int getMaxEmisiuni() {
        return maxEmisiuni;
    }

    public void setMaxEmisiuni(int maxEmisiuni) {
        this.maxEmisiuni = maxEmisiuni;
    }



    public void adaugaEmisiune(Emisiune emisiune){
        if(tablouDeEmisiuni.size() != getMaxEmisiuni()){
            this.tablouDeEmisiuni.add(emisiune);
            System.out.println("Telespectatorul " + telespectator.getName() + " a adaugat " + emisiune.name() + " in programul tv");
        }else {
            System.out.println("Emisiunea nu poate fi adaugata la programul tv ");
        }
    }

    public void stergeEmisiune(Emisiune emisiune){
        if(tablouDeEmisiuni.contains(emisiune)){
            this.tablouDeEmisiuni.remove(emisiune);
            System.out.println("Emisiune stearsa");
        }else {
            System.out.println("Emisiunea nu se afla in lista");
        }

    }

    public void afiseazaEmisiunile(){
        System.out.println("Emisiuni: ");
        for(Emisiune i: tablouDeEmisiuni){
            System.out.println(i.getNume());
        }
    }




}
