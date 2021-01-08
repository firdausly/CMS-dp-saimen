
public class Friends extends AcquaintancesFactory {
    
    @Override
    protected Acquaintances createAcquaintance(int acquaintance){
        switch (acquaintance) {
           case 0:
               return new PersonalFriends();
           case 1:
               return new Relatives();
           case 2:
               return new ProfessionalFriends();
           default:
               return new CasualAcquaintances();
       }
    }
}
