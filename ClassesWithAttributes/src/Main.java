public class Main {

    public static void main(String[] args) {

      //  Product product = new Product();

        /*product.id = 12334;
        product.name = "Laptop";
        product.description = "Asus";
        product.price = 3500;
        System.out.println(product.id);
        product.color = "red";*/

        //encapsulation

        //default deger vermem gerekseydi aşşağıdaki kullanım hata verirken yukarıdaki kullanımda sorunsuz kullanım mümkün olurdu.
        // Ve aşşağıdaki koda defalarca dokunmam gerekcekti
        //bu nedenle aşağıdaki kullanım NOT BEST PRACTICE

        /*productManager.Add(1, "", "", 2, 200);
        productManager.Add(1, "", "", 2, 200);
        productManager.Add(1, "", "", 2, 200);*/

        // product.method();

        ProductManager productManager = new ProductManager();
       // productManager.Add(product);

        //after getter setter
        /*product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus");
        product.setPrice(3500);
        product.setColor("purple");

        System.out.println(product.getKod());*/

        // Özetle: field-> private-> getter setter -> refactor encapsulation

        //Constructor

        Product product = new Product(1, "Laptop","Asus");
        //yukarıdaki şekilde de set etmek mümkün

        //aynı anda product classında iki ayrı constructorı parametreli ve parametresiz olarak kullanabiliriz buna overloading denir
        //ama main classta new leyince birinin adı değişmeli en azından çünkü hata veriyor already defined seklinde
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop");
        product1.setDescription("Asus");
        product1.setPrice(3500);
        product1.setColor("purple");



    }
}
