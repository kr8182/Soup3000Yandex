public class PotatoSoup extends Bouillon {
    double potato;
    double carrot;

    PotatoSoup(Bouillon bouillon, double meat, double potato, double carrot) {
        super(bouillon, meat);
        this.potato = potato;
        this.carrot = carrot;
    }

    PotatoSoup(Bouillon bouillon, double potato, double carrot) {
        super(bouillon, meat);
        this.potato = potato;
        this.carrot = carrot;
    }

    PotatoSoup(double water, double salt, double meat, double potato, double carrot) {
        this.water = water;
        this.salt = salt;
        this.meat = meat;
        this.potato = potato;
        this.carrot = carrot;
    }



    // реализуйте необходимые конструкторы

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты картофельного супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Мясо: " + meat + " г.");
        System.out.println("Картошка: " + potato + " шт.");
        System.out.println("Морковка: " + carrot + " шт.");
    }
}