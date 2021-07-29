package pt.iade.Security24.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import pt.iade.Security24.models.views.Utilizador;

public interface UtilizadorRepository extends CrudRepository<Utilizador, Integer> {
    String SearchUserQuery = "SELECT PlanosID as id, Utilizadores.Nome as Nome, " +
    "Planos.Nome as PNome " + 
    "FROM Utilizadores, Planos " +
    "WHERE Utilizadores.PlanosID = Planos.PlanosID " + 
    "AND Utilizadores.PlanosID = :idplanos";

@Query(value=SearchUserQuery, nativeQuery=true)
Iterable<Utilizador> findPlanosAssociados(@Param("idplanos") int idplanos);
}
