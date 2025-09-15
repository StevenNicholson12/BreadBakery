public class Baguette extends Bread {
    private double oliveOil;

    public Baguette() {
        super();
        setBreadName("Baguette");
        setRecipe("Mix flour, water, salt, yeast, and olive oil. Shape into long loaf and bake.");
        this.oliveOil = 2.0;
    }
    public Baguette( double flour, double water, double salt, double sugar,
                     double bakingPowder, double yeast,
                     String breadName, String state, String recipe,
                     double oliveOil ) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.oliveOil = oliveOil;
    }

    public double getOliveOil() {
        return oliveOil;
    }
    public void setOliveOil(double oliveOil) {
        this.oliveOil = oliveOil;
    }
    public void recipe() {
        System.out.println("A recipe for Baguette:");
        System.out.println("1. Mix flour, water, salt, yeast, and olive oil.");
        System.out.println("2. Knead the dough.");
        System.out.println("3. Let rise 1–2 hours.");
        System.out.println("4. Shape into long thin loaf.");
        System.out.println("5. Bake at 450°F until golden (20–25 minutes).");
    }
    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + oliveOil + " tbsp of olive oil";
    }

    @Override
    public String toString() {
        return "Baguette{" +
                "breadName='" + getBreadName() + '\'' +
                ", state='" + getState() + '\'' +
                ", oliveOil=" + oliveOil +
                '}';
    }



}
