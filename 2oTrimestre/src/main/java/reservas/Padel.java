package reservas;

public class Padel extends Pista {

    private String paredes;

    public Padel(String techado, int id,String paredes) {
        super(techado, id);
        this.paredes=paredes;
    }


    public String getParedes() {
        return paredes;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }
}
