public class Bread {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName;
    private String state;   // "not baked" or "baked"
    private String recipe;

    public Bread() {
        this.flour = 2.0;
        this.water = 1.0;
        this.salt = 0.5;
        this.sugar = 0.5;
        this.bakingPowder = 0.5;
        this.yeast = 1.0;
        this.breadName = "Generic Bread";
        this.state = "not baked";
        this.recipe = "Mix all ingredients, knead, let rise, and bake.";
    }


    public Bread(double flour, double water, double salt, double sugar,
                 double bakingPowder, double yeast,
                 String breadName, String state, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }


    public double getFlour() {
        return flour;
    }
    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }
    public void setWater(double water) {
        this.water = water;
    }

    public double getSalt() {
        return salt;
    }
    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getSugar() {
        return sugar;
    }
    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getBakingPowder() {
        return bakingPowder;
    }
    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public double getYeast() {
        return yeast;
    }
    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;
    }
    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getRecipe() {
        return recipe;
    }
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }


    public void bake() {
        if (state.equals("not baked")) {
            state = "baked";
            System.out.println("The " + breadName + " is baked now.");
        }
        else {
            System.out.println("Can't bake, " + breadName + " is already baked.");
        }
    }

    public String getIngredients() {
        return flour + " cups of flour\n" +
                water + " cups of water\n" +
                salt + " tsps of salt\n" +
                sugar + " tsps of sugar\n" +
                bakingPowder + " tsps of baking powder\n" +
                yeast + " tsps of yeast";
    }

    @Override
    public String toString() {
        return "Bread Name: " + breadName + "\n" +
                "State: " + state + "\n" +
                "Recipe: " + recipe;
    }
}