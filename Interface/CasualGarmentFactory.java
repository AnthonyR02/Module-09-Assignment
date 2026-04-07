
public class CasualGarmentFactory implements GarmentFactory {
    
    /**
     * Create a Casual Top
     * @return CasualTop object
     */
    @Override
    public Top createTop() {
        return new CasualTop();
    }
    
    /**
     * Create Casual Pants
     * @return CasualPants object
     */
    @Override
    public Pants createPants() {
        return new CasualPants();
    }
    
    /**
     * Create Casual Shoes
     * @return CasualShoes object
     */
    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
