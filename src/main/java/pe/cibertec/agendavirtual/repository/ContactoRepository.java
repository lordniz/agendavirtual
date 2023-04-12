package pe.cibertec.agendavirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cibertec.agendavirtual.model.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}
