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
@Table(name="costumers")
public class Costumer {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name="name")
  private String name;

  @Column(name="last_name")
  private String lastName;

  @Column(name="city")
  private String city;

  @Column(name="address")
  private String address;

  @OneToMany(mappedBy = "costumer")
  private List<Order> orders;
}
