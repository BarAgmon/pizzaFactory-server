package PizzaFactory.repositories;

import PizzaFactory.entities.Costumer;
import PizzaFactory.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostumerRepository extends JpaRepository<Costumer,Long> {
    Costumer findCostumerByUsername(String username);
}
