package pe.edu.upc.EduPack_Solutions_sem5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Clasificacion;
@Repository
public interface IClasificacionRepository extends JpaRepository<Clasificacion,Integer> {
}
