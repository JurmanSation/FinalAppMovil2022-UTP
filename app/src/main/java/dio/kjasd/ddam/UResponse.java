package dio.kjasd.ddam;

import java.util.ArrayList;
import java.util.List;

public class UResponse {
    private Integer IdUsuario;
    private String Usuario;
    private Boolean Validacion;
    private String Numero;
    private ArrayList<PalabrasFavoritas> Favoritos = new ArrayList<>();

    public String getNumero() {
        return Numero;
    }

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public Boolean getValidacion() {
        return Validacion;
    }

    public List<PalabrasFavoritas> getFavoritos() {
        return Favoritos;
    }

    public String getUsuario() {
        return Usuario;
    }
}
