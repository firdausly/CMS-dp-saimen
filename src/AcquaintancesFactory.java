
public abstract class AcquaintancesFactory {
    
    public Acquaintances getAcquaintance(int acquaintance){
        
        Acquaintances acq;
        
        acq = createAcquaintance(acquaintance);
        
        return acq;
    }
    
    //create factory method
    protected abstract Acquaintances createAcquaintance(int acquaintance);
}

