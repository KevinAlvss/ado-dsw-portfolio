package portifolio.portifolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/portifolio")
public class DadosController {
    @GetMapping()
    public ModelAndView renderMyProfile() {
        ModelAndView mv = new ModelAndView("message-view");
        mv.addObject("Nome", "Kevin Alves Pereira");
        mv.addObject("Email", "kevin.bernardo64@gmail.com");
        mv.addObject("DataNasc", "Data de nascimento: 23/11/2004");
        mv.addObject("Github", "Github: https://github.com/KevinAlvss");
        mv.addObject("Tel", "(11) 980926757");
        mv.addObject("Linkedin", "Linkedin: https://www.linkedin.com/in/kevin-alves-pereira/");

        return mv;
    }
}