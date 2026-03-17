package reservas;

public class Pista {
    private String techado;
    private int id;

    public Pista(String techado, int id){
        this.techado = techado;
        this.id=id;
    }

    public String getTechado() {
        return techado;
    }

    public void setTechado(String techado) {
        this.techado = techado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
