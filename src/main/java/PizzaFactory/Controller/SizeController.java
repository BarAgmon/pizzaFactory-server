package PizzaFactory.Controller;
import PizzaFactory.contracts.GetSizeContract;
import PizzaFactory.entities.State;
import PizzaFactory.repositories.StateRepository;
import PizzaFactory.services.Size.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(value="/api/sizes")
@RestController
public class SizeController {

  @Autowired
  private SizeService sizeService;

  @GetMapping("/")
  public List<GetSizeContract> getAllOptionalSizes() {
    return sizeService.getAllOptionalSizes().stream().map(GetSizeContract::convertSizeEntityToContract)
            .collect(Collectors.toList());
  }
}
