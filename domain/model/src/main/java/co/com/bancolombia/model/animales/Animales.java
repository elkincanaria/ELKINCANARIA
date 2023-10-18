package co.com.bancolombia.model.animales;
import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Animales {
    private String nombre;
    private Long patas;
    private String genero;
    private String especie;
    private String habitad;
    private Boolean domestico;
}
