package PizzaFactory.entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="pizzas")
public class Pizza {

  @Id
  @GeneratedValue
  private Long id;

  @ManyToOne
  @JoinColumn(name="size_id", referencedColumnName = "id")
  private Size size;

  @ManyToOne
  @JoinColumn(name="order_id", referencedColumnName = "id")
  private Order order;

  @OneToMany(mappedBy = "pizza")
  private List<Addition> additions;
}
