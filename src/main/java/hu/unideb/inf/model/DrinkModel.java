package hu.unideb.inf.model;

public class DrinkModel {
        private Drinks drinks;

        public DrinkModel(String name, int ar ) {
            this.drinks = new Drinks();
        }

        public Drinks getDrinks() {
            return drinks;
        }

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }
}


