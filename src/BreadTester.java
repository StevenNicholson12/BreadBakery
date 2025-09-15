public class BreadTester {
    public static void main(String[] args) {
        // Test each subclass

        System.out.println("=== SourdoughBread ===");
        SourdoughBread sour = new SourdoughBread();
        System.out.println(sour.getIngredients());
        sour.recipe();
        sour.bake();
        sour.bake();
        System.out.println();

        System.out.println("=== Pastry ===");
        Pastry pastry = new Pastry();
        pastry.setFilling("cream");
        System.out.println(pastry.getIngredients());
        pastry.recipe();
        pastry.bake();
        pastry.bake();
        System.out.println();

        System.out.println("=== WholeWheatBread ===");
        WholeWheatBread wheat = new WholeWheatBread();
        System.out.println(wheat.getIngredients());
        wheat.recipe();
        wheat.bake();
        System.out.println();

        System.out.println("=== RyeBread ===");
        RyeBread rye = new RyeBread();
        System.out.println(rye.getIngredients());
        rye.recipe();
        rye.bake();
        System.out.println();

        System.out.println("=== Baguette ===");
        Baguette baguette = new Baguette();
        System.out.println(baguette.getIngredients());
        baguette.recipe();
        baguette.bake();
    }
}
