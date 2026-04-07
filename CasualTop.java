*/
public class CasualTop implements Top {
    
    /**
     * Display what wearing this top looks like
     * Overrides the interface method
     */
    @Override
    public void wear() {
        System.out.println("Wearing a comfortable cotton t-shirt");
    }
    
    /**
     * Get description of this top
     * @return String describing this casual top
     */
    @Override
    public String getDescription() {
        return "Casual T-Shirt";
    }
}
