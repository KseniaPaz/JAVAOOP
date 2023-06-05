package JAVAOOP.Homework1;

import java.util.ArrayList;
import java.util.List;

public class hotDrinksMachine implements VendingMachine{

    private final List<hotDrink> drinks;


    public hotDrinksMachine() {
        drinks = new ArrayList<>();
    }


    @Override
    public void addDrink(HotDrink drink) {
        drinks.add(drink);

    }

    @Override
    public hotDrink getProduct(String type, int volume, int temperature) {
        for (hotDrink drink : drinks) {
            if (type.equals(drink.getType()) && volume == drink.getVolume() &&
                    temperature == drink.getTemperature()){
                return drink;

            }

        }
        return null;
    }
    public hotDrink getProduct (String type){
        for (hotDrink drink : drinks) {
            if (type.equals(drink.getType())){
                return drink;
            }
        }
        return null;
    }
    public hotDrink getProduct(int temperature) {
        for (hotDrink drink : drinks) {
            if (temperature == drink.getTemperature()){
                return drink;

            }
        }
        return null;
    } 



}
