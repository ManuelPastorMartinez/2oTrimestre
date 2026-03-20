package mercaDAM;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.Random;
import java.util.Set;

@Getter
@Setter
public class Mercadam {
    static String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static Random random = new Random();
    private Set<Cliente> clientes;

    public Mercadam(){

    }

    public void generarClientes(){
        String usuario = "";
        String contrasenya = "";
        for (int i = 0; i < 8; i++) {
            usuario += caracteres.charAt(random.nextInt(caracteres.length()-1));
            contrasenya += caracteres.charAt(random.nextInt(caracteres.length()-1));
        }

        Cliente cliente = new Cliente(usuario,contrasenya);
        clientes.add(cliente);
    }

    public Set<Cliente> getClientes(Set<Cliente>clientes){
        return Collections.unmodifiableSet(clientes);
    }


}
