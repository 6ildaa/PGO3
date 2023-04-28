public class Main {
    public static void main(String[] args) {

        //User
        User Bartek = new User("Bartek","Bilda","bartek@gmail.com","123");

        //Guest
        User Filip = new User("mail@gmail.com");

        //Guest
        User Krzysiek = new User("mailiczi@interia.pl");
        //Guest (register) change to user
        Krzysiek.getRegister("Krzysiek","Borkowicz","123");

        //Product

        Product product1 = new Product("iPhone", 3499.99,84372,4);
        System.out.println(product1.toString());

        Product product2 = new Product("Tesla",97000.99,83820);

        product2.setPrice(98000.99);
        product2.setQuantity(5);


        //Category
        Category electronics = new Category("Elektornika");
        electronics.addProduct(product1);

        Category cars = new Category("Samochody");
        cars.addProduct(product2);


    }
}
