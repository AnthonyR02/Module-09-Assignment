
public class CasualShoes implements Shoes {
    
    /**
     * Display what wearing these shoes looks like
     * Overrides the interface method
     */
    @Override
    public void wear() {
        System.out.println("Wearing white canvas sneakers");
    }
    
    /**
     * Get description of these shoes
     * @return String describing these casual shoes
     */
    @Override
    public String getDescription() {
        return "Casual Sneakers";
    }
}
