package pe.cibertec.agendavirtual.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
//@Table(name = "contacto")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcontacto")
    private Integer id;
    private String nombre;
    @Column(name="fechnac")
    private LocalDate fechaNacimiento;
    private String celular;
    private String email;
    @Column(name="fechreg")
    private LocalDateTime fechaRegistro;
}
