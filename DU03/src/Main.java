public class Main {
    public static void main(String[] args) {
        Item dort = new Item("dort", 23.50, 3);
        Item cola = new Item("cola", 3.50, 3);
        Item kniha = new Item("kniha", 10.30, 2);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(dort);
        shoppingCart.add(cola);
        shoppingCart.add(kniha);
        shoppingCart.add(cola);

        System.out.println(shoppingCart.getTotalPrice());
        System.out.println(shoppingCart.getItemNames());
        System.out.println(shoppingCart.getTotalPriceWithDiscount(15));


    }
}