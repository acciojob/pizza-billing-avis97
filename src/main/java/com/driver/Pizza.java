package com.driver;

public class Pizza {

    private int price;
    private String bill;
    private int toppings;
    private Boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdder;
    private boolean is_BillCreated;
    private boolean bag;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.price=300;
            this.toppings=70;
        }
        else
        {
            this.price=400;
            this.toppings=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheeseAdded)
        {
            this.price+=80;
            extraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdder)
        {
            this.price+=this.toppings;
            extraToppingsAdder=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!bag)
        {
            this.price+=20;
            bag=true;
        }
    }

    public String getBill(){
        if(!is_BillCreated) {
            if (extraCheeseAdded) {
                this.bill += "Extra Cheese Added: 80" +"\n";
            }
            if (extraToppingsAdder) {
                this.bill += "Extra Toppings Added: " + this.toppings +"\n";
            }
            if (bag) {
                this.bill += "Paperbag Added: 20" +"\n";
            }
            this.bill += "Total Price: " + this.price;
            this.is_BillCreated=true;
            return this.bill;
        }
        return " ";
    }
}
