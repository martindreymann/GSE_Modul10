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
        
    }
    
}
