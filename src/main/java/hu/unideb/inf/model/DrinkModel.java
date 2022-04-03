package hu.unideb.inf.model;

import hu.unideb.inf.property.Drinks;

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


