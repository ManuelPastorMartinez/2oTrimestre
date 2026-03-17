package reservas;

public class Tenis extends Pista{
    private String superficie;

    public Tenis(String techado, int id,String superficie) {
        super(techado, id);
        this.superficie=superficie;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }
}
