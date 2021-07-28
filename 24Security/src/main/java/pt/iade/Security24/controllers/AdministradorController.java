package pt.iade.Security24.controllers;

import java.sql.Date;
//import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import javassist.NotFoundException;
import pt.iade.Security24.models.repositories.AdministradorRepository;
import pt.iade.Security24.models.views.Administrador;



@RestController
@RequestMapping(path="/api/Administradores")
public class AdministradorController {
    private Logger logger = LoggerFactory.getLogger(AdministradorController.class);
    @Autowired
    private AdministradorRepository administradorRepository;

    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Administrador> getAdministrador() {
        logger.info("Enviando todas os administradores");
        return administradorRepository.findAll();
    }

    @PostMapping(path ="/CriarPlano/{AdminID}/{nome}/{mail}/{nomeAdmin}/{pass}/{datanasci}", produces= MediaType.APPLICATION_JSON_VALUE) 
        public int AdicionaPlano(@PathVariable int AdminID,@PathVariable String nome,@PathVariable String mail,
                                                    @PathVariable String nomeAdmin,@PathVariable String pass, @PathVariable Date datanasci)

        {
            logger.info("A inserir novo plano");
            return administradorRepository.AdicionaPlano(AdminID, nome, mail, nomeAdmin, pass, datanasci);
        }
}
