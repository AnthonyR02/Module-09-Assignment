*/
public class PartyShoes implements Shoes {
    
    @Override
    public void wear() {
        System.out.println("Wearing sparkly high heels");
    }
    
    @Override
    public String getDescription() {
        return "Party High Heels";
    }
}
