package PizzaFactory.services.Size;

import PizzaFactory.contracts.GetSizeContract;
import PizzaFactory.entities.Size;

public class SizeHelpFunctions {
    public GetSizeContract convertSizeEntityToContract(Size size){
        int  = size.getName().toUpperCase().replaceAll(" ","_");
        return new GetSizeContract(size.getName(), size.getPrice(), )
    }



}
