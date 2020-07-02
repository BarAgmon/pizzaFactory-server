package PizzaFactory.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Pizza {

  @RequestMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }

}
