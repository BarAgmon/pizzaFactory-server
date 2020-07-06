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
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;

  @Column(name="name", nullable=false)
  private String name;

  @Column(name="last_name", nullable=false)
  private String lastName;

  @Column(name="city", nullable=false)
  private String city;

  @Column(name="address", nullable=false)
  private String address;

  @Column(name="username", nullable=false)
  private String username;

  @Column(name="password", nullable=false)
  private String password;

  @OneToMany(mappedBy = "costumer")
  private List<Order> orders;
}
