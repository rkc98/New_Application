package dto;
public class Tests {
    private int id,price;
    private String name;

    public Tests(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Tests() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
