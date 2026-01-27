package Tema5;

public class Editorial {


    private String editorial;
    private String Pais;

    public Editorial(String editorial,String pais){
        this.editorial=editorial;
        this.Pais=pais;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "editorial='" + editorial + '\'' +
                ", Pais='" + Pais + '\'' +
                '}';
    }




}
