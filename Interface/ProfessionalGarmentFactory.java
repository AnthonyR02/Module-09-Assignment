
public class ProfessionalGarmentFactory implements GarmentFactory {
    
    /**
     * Create a Professional Top
     * @return ProfessionalTop object
     */
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }
    
    /**
     * Create Professional Pants
     * @return ProfessionalPants object
     */
    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }
    
    /**
     * Create Professional Shoes
     * @return ProfessionalShoes object
     */
    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
