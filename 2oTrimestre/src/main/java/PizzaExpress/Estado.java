package PizzaExpress;

public enum Estado {

    CREANDO, CANCELADO, RECIBIDO, MONTANDO_PIZZA, HORNEANDO, PREPARANDO_PEDIDO, LISTO;

    public Estado siguiente() {
        switch (this) {
            case CREANDO:
                return RECIBIDO;
            case RECIBIDO:
                return MONTANDO_PIZZA;
            case MONTANDO_PIZZA:
                return HORNEANDO;
            case HORNEANDO:
                return PREPARANDO_PEDIDO;
            case PREPARANDO_PEDIDO:
                return LISTO;
            default:
                return CANCELADO;
        }
    }

}