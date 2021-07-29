package pt.iade.Security24.models.views;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table(name="Planos")
public class Plano {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="PlanosID")
    private int id;

    @Column(name="Nome")
    private String nome;

    @Column(name="Duracao")
    private String duracao;

    @Column(name="Descricao")
    private String descricao;

    @Column(name="preco")
    private double Preco;

    
    public Plano(){}

    public int getPlanosID(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getDuracao(){
        return duracao;
    }

    public double getPreco(){
        return Preco;
    }

}