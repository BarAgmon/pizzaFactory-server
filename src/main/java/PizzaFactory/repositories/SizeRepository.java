package PizzaFactory.repositories;

import PizzaFactory.entities.Size;
import PizzaFactory.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends JpaRepository<Size,Long> {
}
