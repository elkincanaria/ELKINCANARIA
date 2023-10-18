package co.com.bancolombia.api;
import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.usecase.animales.AnimalesUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final AnimalesUseCase animalesUseCase;
    @GetMapping(path = "/path")
    public String commandNombre() {
        return "Hello World";
    }

    @GetMapping(path = "/animales/{id}")
    public Animales read(@PathVariable String id) {
        return animalesUseCase.read(id);
    }

    @PostMapping(path = "/animales")
    public void create(@RequestBody Animales animales) {
        animalesUseCase.create(animales);
    }

    @GetMapping(path = "/animales")
    public List<Animales> getAll() {
        return animalesUseCase.getAll();
    }
    @PutMapping(path = "/animales/{id}")
    public void update(@PathVariable String id, @RequestBody Animales animales) {
        try {
            animalesUseCase.update(id, animales);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
    @DeleteMapping(path = "/animales/{id}")
    public void delete(@PathVariable String id) {
        animalesUseCase.delete(id);
    }
}
