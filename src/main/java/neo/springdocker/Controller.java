package neo.springdocker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/wish")
    public String wish(){
        return "hello Neo";
    }
}
