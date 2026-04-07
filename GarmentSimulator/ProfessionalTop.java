
public class ProfessionalTop implements Top {
    
    /**
     * Display what wearing this top looks like
     * Overrides the interface method
     */
    @Override
    public void wear() {
        System.out.println("Wearing a crisp white dress shirt with a professional blazer");
    }
    
    /**
     * Get description of this top
     * @return String describing this professional top
     */
    @Override
    public String getDescription() {
        return "Professional Blazer";
    }
}
