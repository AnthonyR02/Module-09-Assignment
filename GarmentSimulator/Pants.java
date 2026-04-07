
public interface Pants {
    /**
     * Display information about these pants
     * Each concrete pants will implement this differently
     */
    void wear();
    
    /**
     * Get the style/type of these pants
     * @return String describing the pants (e.g., "Professional Dress Pants")
     */
    String getDescription();
}
