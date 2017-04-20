package Business;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Store {
    
    private String address, name;
    private ProductCatalog catalog;
    private List<Register> registers;
    private Set<Sale> sales;

    public Store(String name, String address){
        this.name = name;
        this.address = address;
        catalog = new ProductCatalog();
        registers = new ArrayList<>();
        sales = new TreeSet<>();
    }
    
    
}
