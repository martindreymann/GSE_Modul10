package Business;

import java.util.ArrayList;
import java.util.List;

public class Register {

    private ProductCatalog catalog;
    private Sale currentSale;
    private List<Sale> salesLog;

    public Register() {
        salesLog = new ArrayList<>();
    }

    public void makeNewSale() {
        currentSale = new Sale();
    }

    public void enterItem(String itemID, int quantity) {
        ProductDescription desc = catalog.getProductDescription(itemID);
        currentSale.makeLineItem(desc, quantity);

    }

    public void makePayment(float amount) {
        //Check if payment is enough
        if(amount <= currentSale.getTotalPrice()){
            paymentInsufficient();
            return;
        }        
        
        currentSale.setIsComplete(true);
        
    }

    public void endSale() {
        salesLog.add(currentSale);

    }
    
   
    public List<Sale> getAllSales(){
        List<Sale> temp = salesLog;
        salesLog.clear();
        return temp;
    }
    
    
    
    //Should probably be changed.
    private void paymentInsufficient(){
        System.out.println("The payment was insufficient. Try again");
    }

}
