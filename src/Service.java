import productStore.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Service {


        void addNewProduct(List<Product> list);
        void sortProduct(List<Product>list2);
        void chekAdminka(List<Product>productList);
    }



