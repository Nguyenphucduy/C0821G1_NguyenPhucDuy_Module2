package l16_io_binaryfile_serialization.exercise.manager_product_save_out_byte.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    private static List<Product> productArrayList = new ArrayList<>();
    List<Product> productwriteFile;
    {
        productwriteFile = writeFile(productArrayList,"E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\l16_io_binaryfile_serialization\\exercise\\manager_product_save_out_byte\\product.txt");
    }
    List<Product> productReadFile = readFile("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\l16_io_binaryfile_serialization\\exercise\\manager_product_save_out_byte\\product.txt");
    static {
        productArrayList.add(new Product(1,"coca","Cocacola",12000));
        productArrayList.add(new Product(2,"pepsi","Pepsi",18000));
        productArrayList.add(new Product(3,"socola","Socolalalala",3000));
    }


    public void addProduct() {
        System.out.print("Enter the id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the name : ");
        String name = scanner.nextLine();
        System.out.print("Enter the manufacturer : ");
        String manufacturer = scanner.nextLine();
        System.out.print("Enter the price : ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, manufacturer, price);
        productArrayList.add(product);
    }

    public void displayProduct() {
        for (Product product : productArrayList) {
            System.out.println(product);
        }
    }

    public void searchProduct() {
        System.out.print("Enter the id : ");
        int idProduct = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (idProduct == productArrayList.get(i).getId()) {
                check = true;
                System.out.println(" product in arrayList");
                System.out.println(productArrayList.get(i).toString());
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

    public static List<Product> readFile(String path) {
        List<Product> products = new ArrayList<>();
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
        List<Product> productList = new ArrayList<>();
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
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.displayProduct();
                    break;
                case 3:
                    productManager.searchProduct();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println(" no choice!");

            }
        } while (choice != 4);
    }

}
