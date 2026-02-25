package PizzaExpress;

public enum CartaPizzas {
    BBQ(9.0), CARBONARA(8.0), JAMON_YORK(6.0), ATUN(7.5), HAWAIANA(7.0), VEGGIE(10.0);

    private final double precio;

    CartaPizzas(Double precio) {this.precio = precio;}

    public double getPrecio() {return precio;}
}
