
public interface GarmentFactory {
    
    /**
     * Create a Top garment
     * Each factory will return a different style of top
     * @return Top object (Professional, Casual, or Party)
     */
    Top createTop();
    
    /**
     * Create a Pants garment
     * Each factory will return a different style of pants
     * @return Pants object (Professional, Casual, or Party)
     */
    Pants createPants();
    
    /**
     * Create a Shoes garment
     * Each factory will return a different style of shoes
     * @return Shoes object (Professional, Casual, or Party)
     */
    Shoes createShoes();
}
