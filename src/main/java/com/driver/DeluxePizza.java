package com.driver;

public class DeluxePizza extends Pizza{

    public DeluxePizza(Boolean isVeg){
        super(isVeg);  //super is used for reference from a parent class....
        addExtraCheese();
        addExtraToppings();
    }
}
