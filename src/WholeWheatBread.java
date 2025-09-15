public class WholeWheatBread extends Bread {
    private double wholeWheatFlour;

    public WholeWheatBread() {
        super();
        setBreadName("Whole Wheat Bread");
        setRecipe("Mix whole wheat flour with other ingredients, knead, rise, and bake.");
        this.wholeWheatFlour = 2.0;
    }

    public WholeWheatBread(double flour, double water, double salt, double sugar,
                           double bakingPowder, double yeast,
                           String breadName, String state, String recipe,
                           double wholeWheatFlour) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.wholeWheatFlour = wholeWheatFlour;
    }

    public double getWholeWheatFlour() { return wholeWheatFlour; }
    public void setWholeWheatFlour(double wholeWheatFlour) { this.wholeWheatFlour = wholeWheatFlour; }

    public void recipe() {
        System.out.println("A recipe for Whole Wheat Bread:");
        System.out.println("1. Mix whole wheat flour, water, salt, sugar, and yeast.");
        System.out.println("2. Knead until smooth.");
        System.out.println("3. Let rise for 1 hour.");
        System.out.println("4. Shape the loaf.");
        System.out.println("5. Bake at 375°F for 35 minutes.");
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + wholeWheatFlour + " cups of whole wheat flour";
    }

    @Override
    public String toString() {
        return "WholeWheatBread{" +
                "breadName='" + getBreadName() + '\'' +
                ", state='" + getState() + '\'' +
                ", wholeWheatFlour=" + wholeWheatFlour +
                '}';
    }
}
