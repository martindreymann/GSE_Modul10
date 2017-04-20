package Business;

import java.util.ArrayList;
import java.util.Date;

public class Sale implements Comparable<Sale>{
    private Date date;
    private boolean isComplete = false;
    private ArrayList<SalesLineItem> salesLineItems = new ArrayList<>();

    public Sale() {
        date = new Date();
    }
    public void makeLineItem(ProductDescription desc, int quantity){
        salesLineItems.add(new SalesLineItem(desc, quantity));
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<SalesLineItem> getSalesLineItems() {
        return salesLineItems;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    @Override
    public int compareTo(Sale o) {
        return date.compareTo(o.getDate());
    }
    
    public float getTotalPrice(){
        float price = 0;
        
        for(SalesLineItem sli : salesLineItems){
            int quantity = sli.getQuantity();
            float itemPrice = sli.getDescription().getPrice();
            price += (quantity*itemPrice);            
        }
        return price;
        
    }
    
    
}
