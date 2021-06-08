package com.tinderjob.TinderJobCrud.Service;

import java.util.List;
import java.util.Optional;

import com.tinderjob.TinderJobCrud.InterfaceService.DadosPessoaisInterfServ;
import com.tinderjob.TinderJobCrud.Model.DadosPessoais;
import com.tinderjob.TinderJobCrud.Repository.DadosPessoaisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosPessoaisService implements DadosPessoaisInterfServ {
    
    @Autowired
    private DadosPessoaisRepository registros;

    @Override
    public void Apagar(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int Salvar(DadosPessoais dp) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<DadosPessoais> listar() {
        return (List<DadosPessoais>)registros.findAll();
    }

    @Override
    public Optional<DadosPessoais> listarPeloId() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
