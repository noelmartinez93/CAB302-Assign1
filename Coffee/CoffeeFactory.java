package patt.Coffee;

import java.util.ArrayList;

public class CoffeeFactory {

    public static enum Type {
        LONG_BLACK(4.0),
        FLAT_WHITE(4.75),
        MOCHA(5.5);

        private double price;

        Type(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    public static enum Ingredient {
        ESPRESSO(0.5),
        MILK(1),
        CHOCOLATE(1.5);

        private double cost;

        Ingredient(double cost) {
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }
    }


    public static Coffee CreateCoffee(Type type)
    {
        ArrayList<Ingredient> product = new ArrayList<Ingredient>();
        if(type == Type.LONG_BLACK)
        {
            product.add(Ingredient.ESPRESSO);
            product.add(Ingredient.ESPRESSO);
        }
        if(type == Type.FLAT_WHITE)
        {
            product.add(Ingredient.ESPRESSO);
            product.add(Ingredient.MILK);
        }
        if(type == Type.MOCHA)
        {
            product.add(Ingredient.CHOCOLATE);
            product.add(Ingredient.ESPRESSO);
            product.add(Ingredient.MILK);
        }
        return new Coffee(product,type);
    }
}
