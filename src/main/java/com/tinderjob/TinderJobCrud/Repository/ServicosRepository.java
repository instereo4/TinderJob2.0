package com.tinderjob.TinderJobCrud.Repository;

import com.tinderjob.TinderJobCrud.Model.Servicos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicosRepository extends CrudRepository <Servicos, Integer> {
    
}
