package l11_map_and_tree.exercise.practice_arraylist_linkedlist.controller;

import l11_map_and_tree.exercise.practice_arraylist_linkedlist.model.Product;
import l11_map_and_tree.exercise.practice_arraylist_linkedlist.model.ProductManager;
import l11_map_and_tree.exercise.practice_arraylist_linkedlist.service.SortProductByPrice;

import java.util.Collections;
import java.util.Scanner;

public class ProductManagerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
//        productManager.addProduct(new Product("Apple",1.0,1));
//        productManager.addProduct(new Product("Nokia",3.0,3));
//        productManager.addProduct(new Product("SamSung",2.0,2));



//        for (Product product : productManager.getProductList()) {
//            System.out.println( product);
//        }

//        System.out.println("Choose product can update");

        /*TH1 lay doi tuong co san trong List*/
        Product product = productManager.getProductList().get(1);
        System.out.print("Update Name : ");
        String newName = scanner.nextLine();
        product.setName(newName);
        System.out.print("Update Price : ");
        Double newPrice = Double.valueOf(scanner.nextLine());
        product.setPrice(newPrice);
        System.out.println(productManager.getProductList());

        /*TH2 thong tin update nguoi dung tu tao*/
//       Product productNew = new Product("Oppo",4.0,4);
//
//        productManager.updateProduct(productNew);
//        System.out.println(productManager.getProductList());
//        productManager.removeProduct(2);
//
//        System.out.println("-----------------------");
//        System.out.println(productManager.getProductList());

//        Collections.sort(productManager.getProductList(), new SortProductByPrice());
//
//        System.out.println("-----------------------");
//        System.out.println(productManager.getProductList());
//        System.out.print("Enter the name product");
//        String getName = scanner.nextLine();
//        System.out.println(productManager.getProductInfo(getName));
//        System.out.println("input id product");
//        int id = 1;
//        System.out.println(productManager.isExist(new Product(id)));
//        System.out.print("Enter the id product : ");
//        int getId = Integer.parseInt(scanner.nextLine());
//        Product product1 = productManager.getProductInfo(getId);
//        if (product1 == null){
//            System.out.println("id not found");
//        }else {
//            System.out.println(product1);
//        }
//        productManager.sort();
    }
}
