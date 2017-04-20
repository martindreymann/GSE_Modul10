package Business;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import nextgenpos.IBusiness;

public class Store implements IBusiness {

    private String address, name;
    private ProductCatalog catalog;
    private Map<String, Register> registers;
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

    @Override
    public ProductDescription findProductDescription(String id) {
        return catalog.getProductDescription(id);
    }

    @Override
    public Map<String, Register> getRegisters() {
        return registers;
    }

    public void createNewProduct(String itemID, String description, float price) {
        catalog.createNewProduct(itemID, description, price);
    }

    public void createNewRegister(String name) {
        registers.put(name, new Register(name, catalog));
    }

    public Register getRegister(String name) {
        return registers.get(name);
    }
    
    @Override
    public void createTestData(){
        
        
        //Make products
        createNewProduct("1", "TV", 500);
        createNewProduct("2", "PC", 700);
        createNewProduct("3", "Headset", 300);
        createNewProduct("4", "Fridge", 2000);
        createNewProduct("5", "Something expensive", 42500);
        
        //Make register
        createNewRegister("Register1");
        createNewRegister("Register2");
        createNewRegister("Register3");
 
        
    }

}
