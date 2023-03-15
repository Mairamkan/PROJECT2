import productStore.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreService implements Service{
    private final List<Product> products = new ArrayList<>();
    List<Product> vitrina;
    Adminka adminka = new Adminka();


    @Override
    public void addNewProduct(List<Product> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDate().minusMonths(1).isAfter(LocalDate.now())) {
                if (list.get(i).getCompanyName().equals("TOIBOSS")
                        || list.get(i).getCompanyName().equals("NUR")
                        || list.get(i).getCompanyName().equals("MILKA")) {
                    products.add(list.get(i));

                }
            }
        }
        System.out.println(" Priniyatye products ");
        for (Product product : products) {
            System.out.println(product);
        }

    }
    @Override
    public void sortProduct(List<Product> list2) {
        list2.removeIf(u -> u.getDate().isBefore(LocalDate.now()));
        List<Product> lis = list2.stream().filter(r -> r.getCompanyName().equals("TOIBOSS")
                        || r.getCompanyName().equals("NUR") || r.getCompanyName().equals("MILKA"))
                .filter(v -> !v.getDate().isAfter(LocalDate.now().plusDays(7))).toList();
        System.out.println("Aksiya");
        lis.forEach(System.out::println);

    }

    @Override
    public void chekAdminka(List<Product> productList) {

    }

}