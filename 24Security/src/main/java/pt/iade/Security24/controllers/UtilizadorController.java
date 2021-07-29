package pt.iade.Security24.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import pt.iade.Security24.models.repositories.UtilizadorRepository;
import pt.iade.Security24.models.views.Utilizador;

@RestController
@RequestMapping(path = "/api/Utilizadores")
public class UtilizadorController {
    private Logger logger = LoggerFactory.getLogger(UtilizadorController.class);
    @Autowired
    private UtilizadorRepository utilizadorRepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Utilizador> getUtilizadores() {
        logger.info("Mostra todos os Utilizadores");
        return utilizadorRepository.findAll();
    }

    @GetMapping(path = "/Utilizadores/{idplanos}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Utilizador> findPlanosAssociados(@PathVariable int idplanos)
    {
        logger.info("Consulta utilizadores associados a um plano " + idplanos);
        return utilizadorRepository.findPlanosAssociados(idplanos);
    }
}

