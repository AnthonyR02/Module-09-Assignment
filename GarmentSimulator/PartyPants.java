
public class PartyPants implements Pants {
    
    @Override
    public void wear() {
        System.out.println("Wearing sleek satin dress pants");
    }
    

    @Override
    public String getDescription() {
        return "Party Dress Pants";
    }
}
