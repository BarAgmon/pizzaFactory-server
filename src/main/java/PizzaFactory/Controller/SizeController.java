package PizzaFactory.Controller;
import PizzaFactory.entities.State;
import PizzaFactory.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value="/api/sizes")
@RestController
public class SizeController {

  @Autowired
  private StateRepository stateRepository;

  @GetMapping("/")
  public String getAllOptionalSizes() {
    String str = "hello world";
    return str.toUpperCase().replaceAll(" ","_");
  }

}
