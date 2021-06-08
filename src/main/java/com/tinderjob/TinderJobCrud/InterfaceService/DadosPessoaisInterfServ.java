package com.tinderjob.TinderJobCrud.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.tinderjob.TinderJobCrud.Model.DadosPessoais;

public interface DadosPessoaisInterfServ {

    public List<DadosPessoais> listar();
    public Optional<DadosPessoais> listarPeloId();
    public int Salvar(DadosPessoais dp);
    public void Apagar(int id);
        
}
