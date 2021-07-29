package pt.iade.Security24.models.repositories;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.Query;

import pt.iade.Security24.models.views.Plano;
//import org.springframework.data.repository.query.Param;




public interface PlanoRepository extends CrudRepository<Plano, Integer> {
    
}
    