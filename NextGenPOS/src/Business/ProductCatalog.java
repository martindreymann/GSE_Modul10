package Business;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    
    private Map<String,ProductDescription> productMap;
    
    public ProductCatalog(){
        productMap = new HashMap<>();
    }
    
    public ProductDescription getProductDescription(String itemID){
        return productMap.get(itemID);
    }
    
}
