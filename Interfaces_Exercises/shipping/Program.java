import providers.*;

    public class Program {
        public static void main(String[] args) {
            Order order1 = new Order(1, 1500, 234.90);
            Order order2 = new Order(2, 600, 124.00);
            Order order3 = new Order(3, 3000, 53.00);
            Order order4 = new Order(4, 7000, 300.00);

            OrderProcessor orderProcessorFedex = new OrderProcessor(new Fedex());
            orderProcessorFedex.process(order1);

            System.out.printf(String.format("%s - %.2f\n", order1.getShipping().getShippingProviderType(), order1.getShipping().getValue()).replace(".", ","));

            OrderProcessor orderProcessorUnitedParcelService = new OrderProcessor(new UnitedParcelService());
            orderProcessorUnitedParcelService.process(order1);

            System.out.printf(String.format("%s - %.2f\n", order1.getShipping().getShippingProviderType(), order1.getShipping().getValue()).replace(".", ","));

            OrderProcessor orderProcessorDalseyHillblomLynn = new OrderProcessor(new DalseyHillblomLynn());
            orderProcessorDalseyHillblomLynn.process(order1);

            System.out.printf(String.format("%s - %.2f\n", order1.getShipping().getShippingProviderType(), order1.getShipping().getValue()).replace(".", ","));

            System.out.println("-----");

            orderProcessorFedex.process(order2);
            System.out.printf(String.format("%s - %.2f\n", order2.getShipping().getShippingProviderType(), order2.getShipping().getValue()).replace(".", ","));

            orderProcessorUnitedParcelService.process(order2);        
            System.out.printf(String.format("%s - %.2f\n", order2.getShipping().getShippingProviderType(), order2.getShipping().getValue()).replace(".", ","));

            orderProcessorDalseyHillblomLynn.process(order2);
            System.out.printf(String.format("%s - %.2f\n", order2.getShipping().getShippingProviderType(), order2.getShipping().getValue()).replace(".", ","));

            System.out.println("-----");  

            orderProcessorFedex.process(order3);
            System.out.printf(String.format("%s - %.2f\n", order3.getShipping().getShippingProviderType(), order3.getShipping().getValue()).replace(".", ","));

            orderProcessorUnitedParcelService.process(order3);        
            System.out.printf(String.format("%s - %.2f\n", order3.getShipping().getShippingProviderType(), order3.getShipping().getValue()).replace(".", ","));

            orderProcessorDalseyHillblomLynn.process(order3);
            System.out.printf(String.format("%s - %.2f\n", order3.getShipping().getShippingProviderType(), order3.getShipping().getValue()).replace(".", ","));

            System.out.println("-----");       

            orderProcessorFedex.process(order4);
            System.out.printf(String.format("%s - %.2f\n", order4.getShipping().getShippingProviderType(), order4.getShipping().getValue()).replace(".", ","));

            orderProcessorUnitedParcelService.process(order4);        
            System.out.printf(String.format("%s - %.2f\n", order4.getShipping().getShippingProviderType(), order4.getShipping().getValue()).replace(".", ","));

            orderProcessorDalseyHillblomLynn.process(order4);
            System.out.printf(String.format("%s - %.2f\n", order4.getShipping().getShippingProviderType(), order4.getShipping().getValue()).replace(".", ","));        
        }
    }