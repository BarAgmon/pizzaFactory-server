package PizzaFactory.contracts;

import PizzaFactory.entities.Size;
import PizzaFactory.enums.PizzaPicsId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetSizeContract {
    private String name;
    private int price;
    private int pictureId;

    public static GetSizeContract convertSizeEntityToContract(Size size){
        int sizePictureId = PizzaPicsId.valueOf(size.getName().toUpperCase()
                .replaceAll(" ","_")).ordinal();
        return new GetSizeContract(size.getName(), size.getPrice(), sizePictureId);
    }
}
