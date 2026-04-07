
public class CasualPants implements Pants {
    
    @Override
    public void wear() {
        System.out.println("👖 Wearing classic blue jeans");
    }
    
    /**
     * Get description of these pants
     * @return String describing these casual pants
     */
    @Override
    public String getDescription() {
        return "Casual Jeans";
    }
}
