public class SourdoughBread extends Bread {
    private double starter;

    public SourdoughBread() {
        super();
        setBreadName("Sourdough Bread");
        setRecipe("Mix flour, water, salt, yeast, and sourdough starter. Let rise, shape, and bake.");
        this.starter = 1.0;
    }


    public SourdoughBread(double flour, double water, double salt, double sugar,
                          double bakingPowder, double yeast,
                          String breadName, String state, String recipe,
                          double starter) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.starter = starter;
    }

    public double getStarter() { return starter; }
    public void setStarter(double starter) { this.starter = starter; }

    public void recipe() {
        System.out.println("A recipe for Sourdough Bread:");
        System.out.println("1. Mix flour, water, salt, yeast, and sourdough starter.");
        System.out.println("2. Let dough bulk rise for 8–12 hours.");
        System.out.println("3. Shape the dough.");
        System.out.println("4. Let it proof again.");
        System.out.println("5. Bake at 450°F until golden brown.");
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + starter + " cups of sourdough starter";
    }

    @Override
    public String toString() {
        return "SourdoughBread{" +
                "breadName='" + getBreadName() + '\'' +
                ", state='" + getState() + '\'' +
                ", starter=" + starter +
                '}';
    }
}
