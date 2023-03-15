import productStore.product.Product;
import productStore.product.meatProduct.Fish;
import productStore.product.meatProduct.LambMeat;
import productStore.product.meatProduct.Sausage;
import productStore.product.milkProduct.Kefir;
import productStore.product.milkProduct.Milk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
 //       Scanner scan = new Scanner ( System.in );
//        String login;
//        String password;
//        System.out.println ( "Логин жаз : " );
//        login = scan.next ( );
//        System.out.println ( "Пароль жаз :");
//
        //       password = scan.next ( );
       StoreService storeService = new StoreService();
        List<Product> products = new ArrayList<>();
        products.add(new Fish(1, "fish1", "TOIBOSS", LocalDate.of(2023, 5, 14)));
        products.add(new LambMeat(3, "TOIBOSS", "NUR", LocalDate.of(2023, 4, 9)));
        products.add(new Sausage(1, "sausage", "TOIBOSS", LocalDate.of(2023, 4, 14)));
        products.add(new Fish(2, "fish2", "TOIBOSS", LocalDate.of(2023, 4, 6)));
       products.add(new Penne(1, "pasta", "NUR", LocalDate.of(2023, 3, 8)));
       products.add(new Ban(1, "ban", "NUR", LocalDate.of(2023, 3, 15)));
        products.add(new Kefir(1, "kefir", "MILKA", LocalDate.of(2023, 4, 6)));
        products.add(new Milk(1, "milk", "MILKA", LocalDate.of(2023, 3, 14)));
        products.add(new SourCream(1, "sourCream", "MILKA", LocalDate.of(2023, 4, 6)));


       
       storeService.addNewProduct(products);

       storeService.sortProduct(products);

       storeService.chekAdminka(products);




    }
}


