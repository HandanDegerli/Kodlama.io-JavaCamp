public class ProductManager {
    public void add(Product product) {
        //first way-without static
        /*ProductValidator validator = new ProductValidator();
        if (validator.isValid(product)) {
            System.out.println("Product is added");
        }else {
            System.out.println("Product info is not valid");
        }*/

        //second way ProductValidator should be static at the same time
        if (ProductValidator.isValid(product)) {
            System.out.println("Product is added");
        }else {
            System.out.println("Product info is not valid");
        }
        ProductValidator productValidator = new ProductValidator();
        productValidator.bisey();

    }
}
