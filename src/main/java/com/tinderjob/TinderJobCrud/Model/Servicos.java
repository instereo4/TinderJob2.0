package com.tinderjob.TinderJobCrud.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servico")
public class Servicos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String tipoServico; //Pedreiro, Encanador, Eletricista, Mecânico, Pintor e Gesseiro;
    private String formaCobranca; // Por serviço, Por Hora, Por Diaria
    private String valorServico; 
    private String formaRecebimento; // por Cartão Debito/Credito, Espécie, Pix ou Transferencia Bancária.

    @ManyToOne
    @JoinColumn(name =" usuario_id")
    private Usuario usuario;
    
    public Servicos(int id, String tipoServico, String formaCobranca, String valorServico, String formaRecebimento) {
        this.id = id;
        this.tipoServico = tipoServico;
        this.formaCobranca = formaCobranca;
        this.valorServico = valorServico;
        this.formaRecebimento = formaRecebimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getFormaCobranca() {
        return formaCobranca;
    }

    public void setFormaCobranca(String formaCobranca) {
        this.formaCobranca = formaCobranca;
    }

    public String getValorServico() {
        return valorServico;
    }

    public void setValorServico(String valorServico) {
        this.valorServico = valorServico;
    }

    public String getFormaRecebimento() {
        return formaRecebimento;
    }

    public void setFormaRecebimento(String formaRecebimento) {
        this.formaRecebimento = formaRecebimento;
    }


    
}
