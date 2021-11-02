package ss21_structural_design_pattern.facade_design_pattern.controller;

import ss21_structural_design_pattern.facade_design_pattern.facade.ShopFacade;

public class Client {
    public static void main(String[] args) {
        ShopFacade shopFacade = ShopFacade.getInstance();
        shopFacade.buyProductByCashWithFreeShipping("hai.truong@codegym.vn");
        shopFacade.buyProductByPaypalWithStandardShipping("hai.truong@codegym.com.vn", "09999999999");
    }
}
