package l11_map_and_tree.exercise.practice_arraylist_linkedlist.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

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

    /**
     * Thêm product
     *
     * @param product
     */

    public void addProduct(Product product) {
        productList.add(product);
    }

    /**
     * fix product
     *
     * @param product
     */

    public void updateProduct(Product product) {
        //kiem tra 'product' co ton tai trong list studentList
        int index = productList.indexOf(product);

        if (index == -1) {
            //'product' khong co trong list --> them 'product' vao list
            addProduct(product);
//            System.out.println("loi product khong ton tai..");
        } else {
            productList.set(index, product);
        }
    }

    /**
     * Xóa sản phẩm theo index
     *
     * @param index
     */

    public void removeProduct(int index) {
        if (index < 0 || index >= this.productList.size()) {
            System.out.println("Index not correct: " + index);
        } else {
            this.productList.remove(index);
        }
    }


    public boolean isExist(Product product) {
//        if(studentList.contains(student)){
//            return true;
//        } else {
//            return false;
//        }

        return productList.contains(product);
    }

    /**
     * Lấy thông tin sản phẩm theo id
     *
     * @param id
     * @return
     */

    public Product getProductInfo(int id) {
        int index = productList.indexOf(new Product(id));

        if (index == -1) {
            return null;
        } else {
            return productList.get(index);
        }
    }

    /**
     * Lấy thông tin sản phẩm theo tên
     *
     * @param name
     * @return
     */
    public Product getProductInfo(String name) {
        int index = productList.indexOf(new Product(name));

        if (index == -1) {
            return null;
        } else {
            return productList.get(index);
        }
    }

    public void sort() {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println(productList);
    }
}
