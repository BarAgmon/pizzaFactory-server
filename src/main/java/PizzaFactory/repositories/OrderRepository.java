package PizzaFactory.repositories;

import PizzaFactory.entities.Costumer;
import PizzaFactory.entities.Order;
import PizzaFactory.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  OrderRepository extends JpaRepository<Order,Long> {
  List<Order> findOrdersByCostumer(Costumer costumer);
  List<Order> findAll();
  State findStateByOrder(Order order);
}
