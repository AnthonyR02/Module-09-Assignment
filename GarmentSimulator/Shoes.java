
public interface Shoes {
    /**
     * Display information about these shoes
     * Each concrete shoes will implement this differently
     */
    void wear();
    
    /**
     * Get the style/type of these shoes
     * @return String describing the shoes (e.g., "Professional Oxfords")
     */
    String getDescription();
}
