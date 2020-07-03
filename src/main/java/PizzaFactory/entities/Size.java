package PizzaFactory.entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="sizes")
public class Size {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name="name")
  private String name;

  @Column(name="price")
  private int price;

}
