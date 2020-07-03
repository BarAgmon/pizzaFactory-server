package PizzaFactory.repositories;

import PizzaFactory.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  StateRepository extends JpaRepository<State,Long> {
  List<State> findAll();
}
