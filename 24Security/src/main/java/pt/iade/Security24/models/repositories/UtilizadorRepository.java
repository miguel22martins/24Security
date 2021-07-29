/*package pt.iade.Security24.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import pt.iade.Security24.models.views.ListaUtilizador;
import pt.iade.Security24.models.views.Utilizador;

public interface UtilizadorRepository extends CrudRepository<Utilizador, Integer> {
    String SearchUserQuery = "SELECT Utilizadores.UtilizadorID as ID, Utilizadores.Nome as NOME, Utilizadores.Email as EMAIL, "+
                             "Utilizadores.PlanosID "+
                             "FROM Utilizadores, Planos WHERE Utilizadores.PlanosID = Planos.PlanosID "+
                             "AND Utilizadores.PlanosID = :planosid";


@Query(value=SearchUserQuery, nativeQuery=true)
Iterable<ListaUtilizador> findPlanosAssociados(@Param("planosid") int planosid);
}
*/