public class ProductManager {
    public void Add(Product product){
        //JDBC- product type ta göndercez ve kodları yazarak kodlara kaydetcez
        System.out.println("Ürün eklendi." + product.getName());

    }

    //herhangi bir alanı kullanmak için kısıtlamayı öngörür --> encapsulation
    //overloading--> aynı method adı kullanabiliriz
   /* public void Add(int id, String name, String description, int stockAmount, int price, String color ){

    }*/

    //getter setter
    //constructor
}
