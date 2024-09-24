package stock;

public class Product {

    private String name;
    private int quantityInStock;
    private double price;

    public Product(String name, int quantityInStock, double price) {
        this.name = name;
        this.quantityInStock = quantityInStock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return quantityInStock * price;
    }

    public void addStock(int quantity) {
        this.quantityInStock += quantity;
    }

    public void removeStock(int quantity) {
        if (quantity <= quantityInStock) {
            this.quantityInStock -= quantity;
        }else {
            System.out.println("Quantidade insuficiente em estoque!");
        }if (quantityInStock <= 10) {
            System.out.println("Quantidade no estoque BAIXA!");
        }
    }

    public double getTotalPrice(double discount) {
        return quantityInStock * price * (1 - discount / 100);
    }

    public String toString() {
        return "Produto: " 
        + name
        + ", Quantidade em estoque: " 
        + quantityInStock
        + " unidades"
        + ", Preço da unidade: R$ "
        + String.format("%.2f", price)
        + " reais, Preço total: R$ "
        + String.format("%.2f", getTotalPrice())
        + " reais.";
    }
}
