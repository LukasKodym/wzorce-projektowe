public class Test {

    public static void main(String[] args) {

        Pizza pizza = new Margaritha(20,1);

        int price = pizza.getPrice();

        Pasta pasta = new AglioOlio();

        int price1 = pasta.getPrice();
        int weight = pasta.getWeight();
        String description = pasta.description();

        System.out.println("Cena PLN: " +price1 +  ", Waga w kg: " +  + weight + ", Opis: " + description);
    }
}
