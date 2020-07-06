package PizzaFactory.entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="additions")
public class Addition {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;

  @Column(name="name", nullable=false)
  private String name;

  @Column(name="price", nullable=false)
  private int price;

  @ManyToOne
  @JoinColumn(name = "pizza_id", referencedColumnName = "id")
  private Pizza pizza;
}
