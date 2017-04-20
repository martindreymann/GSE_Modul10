package Business;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Store {

    private String address, name;
    private ProductCatalog catalog;
    private Map<String,Register> registers;
    private Set<Sale> sales;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
        catalog = new ProductCatalog();
        registers = new HashMap<>();
        sales = new TreeSet<>();
    }

    public void getSalesFromRegister(Register register) {
        sales.addAll(register.getAllSales());
    }

    public void createNewProduct(String itemID, String description, float price) {
        catalog.createNewProduct(itemID, description, price);
    }
    
    public void createNewRegister(String name){
        registers.put(name,new Register(name,catalog));
    }
    
    public Register getRegister(String name){
        return registers.get(name);
    }
    
    

}
