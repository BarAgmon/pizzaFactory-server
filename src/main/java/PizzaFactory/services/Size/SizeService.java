package PizzaFactory.services.Size;

import PizzaFactory.contracts.GetSizeContract;
import PizzaFactory.entities.Size;
import PizzaFactory.enums.PizzaPicsId;
import PizzaFactory.repositories.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService {
    @Autowired
    private SizeRepository sizeRepository;

    public List<Size> getAllOptionalSizes(){
        return sizeRepository.findAll();
    }
}
