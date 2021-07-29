/*package pt.iade.Security24.models.repositories;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;

import javax.transaction.Transactional;
import pt.iade.Security24.models.views.Administrador;

public interface AdministradorRepository extends CrudRepository<Administrador, Long> {
    
    String AdicionaPlano = ("INSERT INTO Administradores (AdministradorID, Nome, Email, NomeAdministrador, PalavraChave, DataNascimento) " + 
                            "VALUES (:AdminID, :nome, :mail, :nomeAdmin, :pass, :datanasci) "); 
    
    @Modifying @Transactional
    @Query(value = AdicionaPlano, nativeQuery = true)
    int AdicionaPlano(@Param("AdminID") int AdminID, @Param("nome") String nome, @Param("mail") String mail,
                    @Param("nomeAdmin") String nomeAdmin, @Param("pass") String pass, @Param("datanasci") Date datanasci);

}
*/