package Components;

public class Tyres {

    private String type;
    private int nrOfTyres;

    public Tyres(String type, int nrOfTyres){
        this.type = type;
        this.nrOfTyres = nrOfTyres;

    }

    public String getType(){
        return this.type;
    }

    public void setType(String newType){
        this.type = newType;
    }

    public int getNrOfTyres() {
        return nrOfTyres;
    }

    public void setNrOfTyres(int nrOfTyres) {
        this.nrOfTyres = nrOfTyres;
    }


}
