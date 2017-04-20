package Business;

public class ProductDescription {
    
    private String itemID, description;
    private float price;
    
    public ProductDescription(String itemID, String description, float price){
        this.itemID = itemID;
        this.description = description;
        this.price = price;
    }

    public String getItemID() {
        return itemID;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }
    
}
