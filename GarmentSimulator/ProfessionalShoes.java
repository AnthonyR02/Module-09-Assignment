*/
public class ProfessionalShoes implements Shoes {
    

    @Override
    public void wear() {
        System.out.println("Wearing polished black leather oxfords");
    }
    

    @Override
    public String getDescription() {
        return "Professional Oxfords";
    }
}
