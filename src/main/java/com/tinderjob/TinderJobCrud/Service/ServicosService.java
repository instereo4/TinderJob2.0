package com.tinderjob.TinderJobCrud.Service;

import java.util.List;
import java.util.Optional;

import com.tinderjob.TinderJobCrud.InterfaceService.ServicosInterfServ;
import com.tinderjob.TinderJobCrud.Model.Servicos;
import com.tinderjob.TinderJobCrud.Repository.ServicosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicosService implements ServicosInterfServ {

    @Autowired
    private ServicosRepository registros;

    @Override
    public void Apagar(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int Salvar(Servicos s) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Servicos> listar() {
        return (List<Servicos>)registros.findAll();
    }

    @Override
    public Optional<Servicos> listarPeloId() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
