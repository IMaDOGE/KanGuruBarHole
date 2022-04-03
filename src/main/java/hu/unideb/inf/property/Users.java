package hu.unideb.inf.property;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Users {
        private StringProperty username = new SimpleStringProperty();
        private StringProperty password = new SimpleStringProperty();

        public String getName() {
            return username.get();
        }

        public StringProperty nameProperty() {
            return username;
        }

        public String getpw(){return password.get();}

        public Users(){

        }

        public void setName(String username) {
            this.username.set(username);
        }
    public void setpw(String pw) {
        this.password.set(pw);
    }
    }
