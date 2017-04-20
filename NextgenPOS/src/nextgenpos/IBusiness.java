package nextgenpos;

import Business.ProductDescription;
import Business.Register;
import java.util.Map;

public interface IBusiness {
    
    public abstract ProductDescription findProductDescription(String id);
    public abstract Map<String,Register> getRegisters();
    
    
}
