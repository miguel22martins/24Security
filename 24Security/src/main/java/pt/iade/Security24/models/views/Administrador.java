package pt.iade.Security24.models.views;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Administradores")
public class Administrador {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="AdministradorID")
    private int id;

    @Column(name="Nome")
    private String nome;

    @Column(name="Email")
    private String email;

    @Column(name="NomeAdiministrador")
    private String nomeAdmin;

    @Column(name="PalavraChave")
    private String palavraChave;

    @Column(name="DataNascimento")
    private Date dataNascimento;

    public Administrador(){}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    
}
