package co.com.bancolombia.model.animales.gateways;

import co.com.bancolombia.model.animales.Animales;

import java.util.List;

public interface AnimalesRepository {
    void create(Animales animales);
    Animales read(String nombre);
    default Animales update(String nombre, Animales animales) throws Exception {
        return animales;
    };
    void delete(String nombre);
    List<Animales> getAll();
}
