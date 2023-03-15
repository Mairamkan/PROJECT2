import productStore.product.Product;

import java.util.List;
public class Adminka {
    public interface Service {
        void addNewProduct(List<Product> list);

        void sortProduct(List<Product> list2);

        void chekAdminka(List<Product> productList);
    }
    public static final String login = "Mairam";
    public static final String password = "123";

    public Adminka() {



    }
    public String getLogin() {
        return login;
    }
    public String getPassword(){
        return  password;
    }
}

