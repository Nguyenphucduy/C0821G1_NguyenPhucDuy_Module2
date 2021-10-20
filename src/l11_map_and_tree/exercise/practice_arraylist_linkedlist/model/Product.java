package l11_map_and_tree.exercise.practice_arraylist_linkedlist.model;

public class Product {
    private String name;
    private Double price;
    private int id;

    public Product() {
    }


    public Product(String name, Double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Product(int id) {
    }

    public Product(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Product)){
            return false;
        }

        Product otherStudent = (Product) obj;

        if(this.id == otherStudent.getId()){
            return true;
        }
        return false;
    }

}
