package mercaDAM;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Getter
@Setter
@ToString
/**
 * Clase que sirve para iniciar al mercado ficticio al que los clientes van a acudir
 */
public class Mercadam {
    static String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static Random random = new Random();
    private Set<Cliente> clientes;

    /**
     * Constructor que no hay que pasarle nada, simplemente inicia la lista de clientes del mercado
     */
    public Mercadam(){
        clientes=new HashSet<>();
    }

    /**
     * Este método sirve para crear un cliente imaginario aleatorio y asignarle un usuario y una contraseña a ese cliente
     */
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

    /**
     * Este getter sirve para poder llamar a la lista de clientes pero no se podrá modificar al ponerse unmodifiable
     * @param clientes
     * @return
     */
    public Set<Cliente> getClientes(Set<Cliente>clientes){
        return Collections.unmodifiableSet(clientes);
    }


}
