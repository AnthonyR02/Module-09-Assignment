
public class PartyGarmentFactory implements GarmentFactory {
    
    /**
     * Create a Party Top
     * @return PartyTop object
     */
    @Override
    public Top createTop() {
        return new PartyTop();
    }
    
    /**
     * Create Party Pants
     * @return PartyPants object
     */
    @Override
    public Pants createPants() {
        return new PartyPants();
    }
    
    /**
     * Create Party Shoes
     * @return PartyShoes object
     */
    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
