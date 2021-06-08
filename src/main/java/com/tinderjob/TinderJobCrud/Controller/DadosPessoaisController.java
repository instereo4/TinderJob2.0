package com.tinderjob.TinderJobCrud.Controller;

import java.util.List;

import com.tinderjob.TinderJobCrud.InterfaceService.DadosPessoaisInterfServ;
import com.tinderjob.TinderJobCrud.Model.DadosPessoais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DadosPessoaisController {
    
    @Autowired
    private DadosPessoaisInterfServ action;

    @GetMapping("/listar")
    public String listar(Model model){
        List<DadosPessoais> dados = action.listar();
        model.addAttribute("dados_pessoais", dados);
        return "index";
    }

}
