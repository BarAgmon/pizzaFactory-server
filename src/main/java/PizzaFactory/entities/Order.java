package PizzaFactory.entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="orders")
public class Order {

  @Id
  @GeneratedValue
  private Long id;

  @OneToMany(mappedBy = "order")
  private List<Pizza> pizzas;

  @ManyToOne
  @JoinColumn(name="costumer_id", referencedColumnName = "id")
  private Costumer costumer;

  @Column(name="order_time")
  private Date OrderTime;

  @Column(name="comment")
  private String comment;

  @ManyToOne
  @JoinColumn(name="state_id", referencedColumnName = "id")
  private State state;
}
