public class Program {
        public static void main(String[] args) {
            Product product1 = new Product(129.99, "Mouse Gamer");

            System.out.printf(String.format("%s - %.2f - %.2f\n", product1.getName(),
                product1.getPrice(),
                product1.priceWithMarkup.get()).replace(".", ","));

            product1.updateMarkup.accept(15d);

            System.out.printf(String.format("%s - %.2f - %.2f\n", product1.getName(),
                product1.getPrice(),
                product1.priceWithMarkup.get()).replace(".", ","));
        }
    }