package pro.Trartaria.FiltroSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEspacioRepository extends JpaRepository<Espacios, Long>{

}
