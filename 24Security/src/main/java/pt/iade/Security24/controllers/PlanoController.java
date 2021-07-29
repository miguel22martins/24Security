package pt.iade.Security24.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import javassist.NotFoundException;
import java.util.Optional;
import pt.iade.Security24.models.repositories.PlanoRepository;
import pt.iade.Security24.models.views.Plano;
//import pt.iade.Security24.models.views.Utilizador;

@RestController
@RequestMapping(path = "/api/Planos")
public class PlanoController {
    private Logger logger = LoggerFactory.getLogger(PlanoController.class);
    @Autowired
    private PlanoRepository planoRepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Plano> getPlanos() {
        logger.info("Mostra todos os planos");
        return planoRepository.findAll();
    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Plano getUnit(@PathVariable int id) throws NotFoundException {
        logger.info(" Mostra o planos por id  "+ id);
        Optional<Plano> _planos = planoRepository.findById(id);
        if (!_planos.isPresent()) throw new NotFoundException(""+id);
        else return _planos.get() ;
    }
        
}