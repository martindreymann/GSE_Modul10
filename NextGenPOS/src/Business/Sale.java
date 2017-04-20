package Business;

import java.util.ArrayList;
import java.util.Date;

public class Sale {
    private Date date;
    private boolean isComplete = false;
    private ArrayList<Sale> salesLineItems = new ArrayList<>();

    public Sale() {
        date = new Date();
    }
    public void makeLineItem(){
        
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Sale> getSalesLineItems() {
        return salesLineItems;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    
    
}
