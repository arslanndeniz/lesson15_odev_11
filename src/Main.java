public class Main {
    public static void main(String[] args) {
        // Singleton kullanımı
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Builder kullanımı
        Product product = new Product.ProductBuilder("Bilgisayar").setType("Laptop").build();
        System.out.println("Ürün Adı: " + product.getName());
        System.out.println("Ürün Türü: " + product.getType());
    }
}