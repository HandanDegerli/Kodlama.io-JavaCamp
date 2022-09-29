public class ProductValidator {
    //Constructor lar static ise newlemeden de çalışır
    //birden fazla static olusturabiliriz
    static{
        System.out.println("Static constructor worked");
    }

    //Constructor lar new leyince çalışır
    public ProductValidator(){
        System.out.println("Constructor worked");
    }

    //bir ürünü güncellerken veya kaydederken
    //ürünün kurallara uygun olup olmadığını buluruz
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()) {
            return true;
        }else{
            return false;
        }

    }

    public void bisey(){

    }

    //Ana class static olmaz ama
    // public static void delete () --> bunu kullanmak için class ı nı static yapmalıyız
    //buna inner class denir
    public class BaskaClass{
        public static void delete (){

        }
    }

}
