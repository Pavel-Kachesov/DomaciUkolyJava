public class Main {
    public static void main(String[] args) {
        Item kava = new Item("kava", 53.50, 6);
        Item kofola = new Item("kofola", 3.50, 3);
        Item sešit = new Item("sešit", 18.30, 2);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(kava);
        shoppingCart.add(kofola);
        shoppingCart.add(sešit);
        shoppingCart.add(kofola);

        System.out.println(shoppingCart.getTotalPrice());
        System.out.println(shoppingCart.getItemNames());
        System.out.println(shoppingCart.getTotalPriceWithDiscount(15));


    }
}