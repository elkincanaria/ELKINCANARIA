package co.com.bancolombia.jpa;
import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.model.animales.gateways.AnimalesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
@AllArgsConstructor
public class JpaAnimalesImpl implements AnimalesRepository {
    private JPARepositoryAdapter jpaRepositoryAdapter;
    @Override
    public List<Animales> getAll() {
        return jpaRepositoryAdapter.findAll();
    }
    @Override
    public void create(Animales animales) {
        jpaRepositoryAdapter.save(animales);
    }
    @Override
    public Animales read(String nombre) {return jpaRepositoryAdapter.findById(nombre);}

    @Override
    public Animales update(String nombre, Animales animales) throws Exception {
        Animales animalesDb = jpaRepositoryAdapter.findById(nombre);

        if (animalesDb == null) throw new Exception("Animal Not Found : " + nombre);

        animalesDb.setPatas(animales.getPatas());
        animalesDb.setGenero(animales.getGenero());
        animalesDb.setEspecie(animales.getEspecie());
        animalesDb.setHabitad(animales.getHabitad());
        animalesDb.setDomestico(animales.getDomestico());

        jpaRepositoryAdapter.save(animalesDb);
        return animalesDb;
    }
    @Override
    public void delete(String nombre) {
        jpaRepositoryAdapter.deleteById(nombre);
    }
}
