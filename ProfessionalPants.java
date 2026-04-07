
public class ProfessionalPants implements Pants {
    
    /**
     * Display what wearing these pants looks like
     * Overrides the interface method
     */
    @Override
    public void wear() {
        System.out.println("👖 Wearing tailored charcoal dress pants");
    }
    
    /**
     * Get description of these pants
     * @return String describing these professional pants
     */
    @Override
    public String getDescription() {
        return "Professional Dress Pants";
    }
}
