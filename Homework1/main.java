package JAVAOOP.Homework1;

public class main {
    public static void main(String[] args) {

        hotDrink coffee = new hotDrink("coffee", 250, 50);
        hotDrink tea = new hotDrink("tea", 250, 50);

        hotDrinksMachine vendingMachine = new hotDrinksMachine();
        vendingMachine.addDrink(coffee);
        vendingMachine.addDrink(tea);

        System.out.println((vendingMachine.getProduct("tea", 250, 50)));
        System.out.println(vendingMachine.getProduct(50).toString());
        
    }
}
