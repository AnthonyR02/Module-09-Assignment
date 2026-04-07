*/
public class GarmentSimulator {
    
    // Instance variables to hold the current outfit
    private Top top;
    private Pants pants;
    private Shoes shoes;
    
    /**
     * Constructor: Takes a factory and creates a complete matching outfit
     * 
     * @param factory The GarmentFactory to use (Professional, Casual, or Party)
     * 
     * Key Point: We don't know what specific factory we're getting!
     * We just know it follows the GarmentFactory interface.
     * This is the power of abstraction.
     */
    public GarmentSimulator(GarmentFactory factory) {
        // Use the factory to create matching garments
        this.top = factory.createTop();
        this.pants = factory.createPants();
        this.shoes = factory.createShoes();
    }
    
    /**
     * Display the complete outfit by calling wear() on each garment
     */
    public void displayOutfit() {
        System.out.println("\n=== Complete Outfit ===");
        top.wear();
        pants.wear();
        shoes.wear();
        System.out.println("=======================\n");
    }
    
    /**
     * Get outfit summary as a string
     * @return String describing the outfit
     */
    public String getOutfitSummary() {
        return String.format("Outfit: %s + %s + %s",
            top.getDescription(),
            pants.getDescription(),
            shoes.getDescription()
        );
    }
    
    /**
     * Main method - Entry point of the program
     * Demonstrates creating different outfits using different factories
     */
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║     GARMENT SIMULATOR - Abstract Factory   ║");
        System.out.println("╚════════════════════════════════════════════╝\n");
        
        // ========================================
        // Scenario 1: Professional/Business Meeting
        // ========================================
        System.out.println("SCENARIO 1: Business Meeting");
        System.out.println("----------------------------------------");
        
        // Create a Professional factory
        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        
        // Pass the factory to create a matching professional outfit
        GarmentSimulator businessOutfit = new GarmentSimulator(professionalFactory);
        
        // Display the outfit
        System.out.println(businessOutfit.getOutfitSummary());
        businessOutfit.displayOutfit();
        
        
        // ========================================
        // Scenario 2: Weekend Casual Outing
        // ========================================
        System.out.println("SCENARIO 2: Weekend Casual");
        System.out.println("----------------------------------------");
        
        // Create a Casual factory
        GarmentFactory casualFactory = new CasualGarmentFactory();
        
        // Pass the factory to create a matching casual outfit
        GarmentSimulator casualOutfit = new GarmentSimulator(casualFactory);
        
        // Display the outfit
        System.out.println(casualOutfit.getOutfitSummary());
        casualOutfit.displayOutfit();
        
        
        // ========================================
        // Scenario 3: Evening Party/Event
        // ========================================
        System.out.println("SCENARIO 3: Evening Party");
        System.out.println("----------------------------------------");
        
        // Create a Party factory
        GarmentFactory partyFactory = new PartyGarmentFactory();
        
        // Pass the factory to create a matching party outfit
        GarmentSimulator partyOutfit = new GarmentSimulator(partyFactory);
        
        // Display the outfit
        System.out.println(partyOutfit.getOutfitSummary());
        partyOutfit.displayOutfit();
        
        
        // ========================================
        // Demonstrate Factory Pattern Benefits
        // ========================================
        System.out.println("\n PATTERN BENEFITS DEMONSTRATED:");
        System.out.println("----------------------------------------");
        System.out.println("1. ✓ All garments in each outfit match perfectly");
        System.out.println("2. ✓ Client code doesn't know concrete classes");
        System.out.println("3. ✓ Easy to add new styles (just create new factory)");
        System.out.println("4. ✓ Easy to add new products (add method to interface)");
        System.out.println("5. ✓ No modification to existing code needed\n");
        
        
        // ========================================
        // Example: Simulating vendor catalog update
        // ========================================
        System.out.println("SIMULATING VENDOR UPDATE:");
        System.out.println("----------------------------------------");
        System.out.println("To add a new 'Athletic' style, we would:");
        System.out.println("1. Create: AthleticTop, AthleticPants, AthleticShoes");
        System.out.println("2. Create: AthleticGarmentFactory");
        System.out.println("3. NO changes to existing code required!");
        System.out.println("4. Open/Closed Principle: Open for extension, closed for modification\n");
    }
}
