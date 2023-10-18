package co.com.bancolombia.jpa.entidades;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "tbanimales")
public class AnimalesEntity {
    @Id private String nombre;
    @Column private Long patas;
    @Column private String genero;
    @Column private String especie;
    @Column private String habitad;
    @Column private Boolean domestico;
}
