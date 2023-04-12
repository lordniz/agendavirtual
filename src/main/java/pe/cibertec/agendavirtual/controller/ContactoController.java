package pe.cibertec.agendavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.cibertec.agendavirtual.model.Contacto;
import pe.cibertec.agendavirtual.repository.ContactoRepository;

import java.util.List;

@Controller
public class ContactoController {

    @Autowired
    private ContactoRepository contactoRepository;
    @GetMapping
    String index(Model model){
        List<Contacto> contactos = contactoRepository.findAll();
        model.addAttribute("contactos",contactos);
        return "index";
    }

}
