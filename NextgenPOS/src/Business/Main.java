package Business;


public class Main {

    public static void main(String[] args) {
        test();
    }
    
    
    public static void test(){
        
        Store store = new Store("Test", "Campus Vej 55");
        
        //Make products
        store.createNewProduct("1", "TV", 500);
        store.createNewProduct("2", "PC", 700);
        store.createNewProduct("3", "Headset", 300);
        
        //Make register
        store.createNewRegister("Register1");
        
        //Do stuff
        Register register = store.getRegister("Register1");
        register.makeNewSale();
        register.enterItem("1", 1);
        register.enterItem("2", 2);
        register.enterItem("3", 1);
        
        System.out.println("Price: "+ register.getCurrentPrice());
        //register.makePayment(2100);
        register.makePayment(2200);
        register.endSale();
        store.getSalesFromRegister(register);
        
        
        
    }
    
}
