package hu.unideb.inf.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Drinks {
    private StringProperty name = new SimpleStringProperty();
    private int ar;

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public int getAr() {
        return ar;
    }

    public Drinks(){

    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setAr(int ar) {
        this.ar = ar;
    }
}
