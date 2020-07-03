package PizzaFactory.Controller;
import PizzaFactory.entities.State;
import PizzaFactory.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class Pizza {

  @Autowired
  private StateRepository stateRepository;

  @RequestMapping("/")
  public List<State> index() {
    return stateRepository.findAll();
  }

}
