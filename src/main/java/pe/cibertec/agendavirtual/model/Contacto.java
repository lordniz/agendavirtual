package pe.cibertec.agendavirtual.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Getter
@Setter
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcontacto")
    private Integer id;
    private String nombre;
    @Column(name="fechanac")
    private LocalDate fechaNacimiento;
    private String celular;
    private String email;
    @Column(name="fechareg")
    private LocalDateTime fechaRegistro;
}
