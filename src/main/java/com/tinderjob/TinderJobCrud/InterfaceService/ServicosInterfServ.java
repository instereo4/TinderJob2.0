package com.tinderjob.TinderJobCrud.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.tinderjob.TinderJobCrud.Model.Servicos;

public interface ServicosInterfServ {
    public List<Servicos> listar();
    public Optional<Servicos> listarPeloId();
    public int Salvar(Servicos s);
    public void Apagar(int id);
}
