public class Wrapper implements Packing {
    
    @Override
    public String pack() {
        return "Wrapper";
    }

    @Override
    public abstract float price();
}
