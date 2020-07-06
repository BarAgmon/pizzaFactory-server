package PizzaFactory.services.Size;

import PizzaFactory.entities.Size;
import PizzaFactory.repositories.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SizeService {
    @Autowired
    private SizeRepository sizeRepository;

    public List<Size> getAllOptionalSizes(){
        sizeRepository.findAll()
    }
}
