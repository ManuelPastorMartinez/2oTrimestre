package aplicacionBancaria;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco implements RepositorioBanco{
    private double saldo;


    public Banco(double saldo){
        this.saldo=saldo;
    }

    public void depositar(String cuenta, double monto){

    }

    public void retirar(String cuenta, double monto){

    }

    @Override
    public double obtenerSaldo(String cuenta) {
        return 0    ;
    }

    @Override
    public void actualizarSaldo(String cuenta, double nuevoSaldo) {

    }
}
