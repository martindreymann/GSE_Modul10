package Business;

public class SalesLineItem {
    
    private int quantity;
    private ProductDescription description;
    
    public SalesLineItem(ProductDescription desc, int quantity){
        this.quantity = quantity;
        this.description = desc;        
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductDescription getDescription() {
        return description;
    }
    
}
