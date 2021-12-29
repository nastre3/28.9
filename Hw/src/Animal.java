public class Animal {
    protected String name;
    public Animal(String n) {
        this.name=n;
    }

    @Override
    public String toString() {
        return "Animal by name " + this.name;
    }
}
