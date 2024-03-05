class Product {
    private String name;
    private String type;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public static class ProductBuilder {
        private String name;
        private String type;

        public ProductBuilder(String name) {
            this.name = name;
        }

        public ProductBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}