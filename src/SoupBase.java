public class SoupBase {
    double water;
    double salt;

    SoupBase(double water, double salt){

        this.water = water;
        this.salt = salt;


    }// реализуйте конструктор

    public void printIngredients() {
        System.out.println("Ингредиенты суповой основы:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
    }
}