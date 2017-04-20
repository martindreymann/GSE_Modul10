package Business;

public class Register {
    
    private ProductCatalog catalog;
    private Sale currentSale;
    
    public void makeNewSale(){
        currentSale = new Sale();
    }
    
    public void enterItem(String itemID, int quantity){
        ProductDescription desc = catalog.getProductDescription(itemID);
        currentSale.makeLineItem(desc, quantity);
        
    }
    
    public void endSale(){}
    
    public void makePayment(float amount){}
    
}
