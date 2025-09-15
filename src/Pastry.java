public class Pastry extends Bread {

    private double butter;
    private int eggs;
    private String filling;


    public Pastry() {

        super();

        setBreadName("Pastry");
        setRecipe("Mix ingredients, fold in butter, shape into layers, and bake.");

        this.butter = 1.0;   // cups
        this.eggs = 2;
        this.filling = "none";
    }


    public Pastry(double flour, double water, double salt, double sugar,
                  double bakingPowder, double yeast,
                  String breadName, String state, String recipe,
                  double butter, int eggs, String filling) {

        super(flour, water, salt, sugar, bakingPowder, yeast,
                breadName, state, recipe);
        this.butter = butter;
        this.eggs = eggs;
        this.filling = filling;
    }


    public double getButter() {
        return butter; }
    public void setButter(double butter) {
        this.butter = butter; }

    public int getEggs() {
        return eggs; }
    public void setEggs(int eggs) {
        this.eggs = eggs; }

    public String getFilling() {
        return filling; }
    public void setFilling(String filling) {
        this.filling = filling; }


    public void recipe() {
        System.out.println("A recipe for Pastry:");
        System.out.println("1. Mix flour, water, salt, sugar, butter, and eggs.");
        System.out.println("2. Knead the dough lightly.");
        System.out.println("3. Chill the dough.");
        System.out.println("4. Roll and fold the dough to create layers.");
        System.out.println("5. Shape and add filling: " + filling + ".");
        System.out.println("6. Preheat oven to 375°F.");
        System.out.println("7. Bake until golden brown (about 20 minutes).");
        System.out.println("8. Remove from oven and let cool.");
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" +
                butter + " cups of butter\n" +
                eggs + " eggs\n" +
                "Filling: " + filling;
    }

    @Override
    public String toString() {
        return "Pastry{" +
                "breadName='" + getBreadName() + '\'' +
                ", state='" + getState() + '\'' +
                ", butter=" + butter +
                ", eggs=" + eggs +
                ", filling='" + filling + '\'' +
                '}';
    }
}
