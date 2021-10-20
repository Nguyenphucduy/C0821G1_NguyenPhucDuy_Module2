package l11_map_and_tree.exercise.practice_arraylist_linkedlist.controller;

import l11_map_and_tree.exercise.practice_arraylist_linkedlist.model.Product;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;


public class ProductLinkedListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Product> listProduct = new LinkedList<Product>();
        Product product2 = new Product("Apple",1.0,1);
        Product product3 = new Product("Samsung",2.0,2);

        listProduct.add(product2);
        listProduct.add(product3);
        int choose;
        do {
            System.out.println(" (Product Management Use LinkedList ) Please choose function : ");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product ");
            System.out.println("3. Remove Product");
            System.out.println("4. Check id Product in LinkedList and display student information ");
            System.out.println("5. Display information Product in LinkedList ");
            System.out.println("6. Sort Product with price ");
            System.out.println("7. OUT ");
            System.out.print("Enter choose : ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {

                case 1:
                    System.out.println("Enter the information Product : name,price,id");
                    System.out.print("Enter the name product : ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the price product : ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter the id product : ");
                    int id = Integer.parseInt(scanner.nextLine());

                    Product product = new Product(name,price, id);
                    listProduct.add(product);

                    break;

                case 2: {
                    int index;
                    System.out.print("Enter the index you want edit : ");
                    index = Integer.parseInt(scanner.nextLine());
                    if (index >= 0 && index <= listProduct.size()) {
                        listProduct.get(index);
                        System.out.println("Enter the information you want to edit");
                        System.out.print("Enter the name edit : ");
                        String nameFix = scanner.nextLine();
                        listProduct.get(index).setName(nameFix);
                        System.out.print("Enter the price edit: ");
                        double priceFix = Double.parseDouble(scanner.nextLine());
                        listProduct.get(index).setPrice(priceFix);
                        System.out.print("Enter the id edit: ");
                        int idFix = Integer.parseInt(scanner.nextLine());
                        listProduct.get(index).setId(idFix);
                        System.out.println("Your information is changed to --  ");
                        System.out.println(listProduct.get(index));

                        break;
                    }
                }
                case 3:
                    System.out.print("Enter the index you want remove : ");
                    int indexRemove = Integer.parseInt(scanner.nextLine());
                    listProduct.remove(indexRemove);
                    break;

                case 4:
                    System.out.print("Enter the Product id you want to check : ");// chưa hoàn thành
                    int idCheck = Integer.parseInt(scanner.nextLine());
                    boolean check = false;
                    for (int i = 0 ; i < listProduct.size() ; i++){
                        if (idCheck==listProduct.get(i).getId()){
                            idCheck = i;
                            check = true;
                        }else {
                            check = false;
                        }
                    }
                    if (check) {
                        System.out.println(" Have product with your id in the LinkedList is : " + listProduct.get(idCheck));
                    }else {
                        System.err.println("your id was not found in the LinkedList");
                    }

                    break;
                case 5:
                    System.out.println("LinkedList of your : ");
                    System.out.println(listProduct);
                    break;

                case 6:
                    listProduct.sort(Comparator.comparingDouble(Product::getPrice));
                    break;

                case 7:
                    System.exit(7);
                default:
                    System.out.println("No choice!");
            }
        }
        while (choose != 7);


    }
}
