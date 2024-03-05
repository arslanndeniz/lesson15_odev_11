class Singleton {
    private static Singleton instance;

    // Constructor özel olarak belirtilmiş, dışarıdan erişim engellenmiş
    private Singleton() {}

    // Singleton örneğini döndüren statik metot
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton örneği oluşturuldu.");
    }
}