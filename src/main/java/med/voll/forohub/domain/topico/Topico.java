package med.voll.forohub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String autor;
    private String curso;
    private Boolean activo;

    public Topico(DatosRegistrarTopico datosRegistrarTopico) {
        this.mensaje = datosRegistrarTopico.mensaje();
        this.curso = datosRegistrarTopico.curso();
        this.titulo = datosRegistrarTopico.titulo();
        this.autor = datosRegistrarTopico.autor();
        this.activo = true;
    }

    public void actualizarTopico(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
    }

    public void desactivarTopico() {
        this.activo = false;
    }
}
