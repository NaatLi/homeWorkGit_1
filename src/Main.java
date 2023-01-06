public class Main {
    public static void main(String[] args) {
        int[] sales = {10, 45, 56};

        SalesManager salesManager = new SalesManager(sales);

        int bestSales = salesManager.max();

        System.out.println(bestSales);
    }
}
