package mercaDAM;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.Set;

@Getter
@Setter
public class Mercadam {
    private Set<Cliente> clientes;

    public Mercadam(){

    }

    public void generarClientes(){

    }

    public Set<Cliente> getClientes(Set<Cliente>clientes){
        return Collections.unmodifiableSet(clientes);
    }


}
