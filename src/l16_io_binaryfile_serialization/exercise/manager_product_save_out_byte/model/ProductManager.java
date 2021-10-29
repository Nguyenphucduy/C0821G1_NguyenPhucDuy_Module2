package l16_io_binaryfile_serialization.exercise.manager_product_save_out_byte.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private  List<Product> productList ;

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);

    }

    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void searchProduct(int idProduct) {
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (idProduct == productList.get(i).getId()) {
                check = true;
                System.out.println(" product in arrayList");
                System.out.println(productList.get(i).toString());
                break;
            }
        }
        if (!check) {
            System.out.println("Product not in arrayList");
        }
    }

    public static List<Product> writeFile(List<Product> products, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static List<Product> readFile(List<Product> products,String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();// ép sáng kiểu List<Product>
            fileInputStream.close();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choice;
        do {
            System.out.println("menu product ");
            System.out.println("1. add");
            System.out.println("2. display");
            System.out.println("3. searching");
            System.out.println("4. exit");
            System.out.print("Enter the choice : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter the id : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the name : ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the manufacturer : ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Enter the price : ");
                    double price = Double.parseDouble(scanner.nextLine());
                    Product product = new Product(id, name, manufacturer, price);
                    productManager.addProduct(product);
                    break;
                case 2:
                   productManager.displayProduct();
                    break;
                case 3:
                    System.out.print("Enter the id : ");
                    int idProduct = Integer.parseInt(scanner.nextLine());
                    productManager.searchProduct(idProduct);
                    break;
                case 4:
                    break;
                default:
                    System.out.println(" no choice!");

            }
        } while (choice != 4);
        final String path = "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\l16_io_binaryfile_serialization\\exercise\\manager_product_save_out_byte\\product.txt";
        writeFile(productManager.getProductList(), path);
        List<Product> productList = readFile(productManager.getProductList(), path);
        for (Product product : productList){
            System.out.println(product);
        }
    }

}
