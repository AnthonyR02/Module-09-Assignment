/**
 * Top interface - Abstract product for all tops
 * This defines what every top garment must be able to do
 */
public interface Top {
    /**
     * Display information about this top
     * Each concrete top will implement this differently
     */
    void wear();
    
    /**
     * Get the style/type of this top
     * @return String describing the top (e.g., "Professional Blazer")
     */
    String getDescription();
}
