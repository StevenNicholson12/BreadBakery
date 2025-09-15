public class RyeBread extends Bread {
    private double ryeFlour;
    private double carawaySeeds;

    public RyeBread() {
        super();
        setBreadName("Rye Bread");
        setRecipe("Mix rye flour, caraway seeds, and other ingredients, rise, and bake.");
        this.ryeFlour = 2.0;
        this.carawaySeeds = 1.0;
    }

    public RyeBread(double flour, double water, double salt, double sugar,
                    double bakingPowder, double yeast,
                    String breadName, String state, String recipe,
                    double ryeFlour, double carawaySeeds) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.ryeFlour = ryeFlour;
        this.carawaySeeds = carawaySeeds;
    }

    public double getRyeFlour() {
        return ryeFlour; }
    public void setRyeFlour(double ryeFlour) {
        this.ryeFlour = ryeFlour; }

    public double getCarawaySeeds() {
        return carawaySeeds; }
    public void setCarawaySeeds(double carawaySeeds) {
        this.carawaySeeds = carawaySeeds; }

    public void recipe() {
        System.out.println("A recipe for Rye Bread:");
        System.out.println("1. Mix rye flour, regular flour, water, salt, and yeast.");
        System.out.println("2. Add caraway seeds for flavor.");
        System.out.println("3. Knead the dough.");
        System.out.println("4. Let rise until doubled in size.");
        System.out.println("5. Bake at 400°F for 30–35 minutes.");
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" +
                ryeFlour + " cups of rye flour\n" +
                carawaySeeds + " tsps of caraway seeds";
    }

    @Override
    public String toString() {
        return "RyeBread{" +
                "breadName='" + getBreadName() + '\'' +
                ", state='" + getState() + '\'' +
                ", ryeFlour=" + ryeFlour +
                ", carawaySeeds=" + carawaySeeds +
                '}';
    }
}
