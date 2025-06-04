public class VegetarianSoup extends SoupBase {
    double vegetables;

    VegetarianSoup(SoupBase soupBase, double vegetables){
        super(soupBase.water, soupBase.salt);
        this.vegetables = vegetables;
    }

    VegetarianSoup(double water, double salt, double vegetables){
        this.water = water;
        this.salt = salt;
        this.vegetables = vegetables;
    }

    // реализуйте необходимые конструкторы

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты вегетарианского супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Овощи: " + vegetables + " г.");
    }
}