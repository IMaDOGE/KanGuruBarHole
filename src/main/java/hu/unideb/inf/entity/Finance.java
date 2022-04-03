package hu.unideb.inf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
public class Finance
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Finance(String user, String endSession, int moneyBeforeSession, int moneyAfterSession, int netIncome, int grossIncome) {
        this.user = user;
        this.startSession = getStartSession(); //TODO: test functionality
        this.endSession = endSession;
        this.moneyBeforeSession = moneyBeforeSession;
        this.moneyAfterSession = moneyAfterSession;
        this.netIncome = netIncome;
        this.grossIncome = grossIncome;
    }

    public Finance(){
    }

    private String user;
    private String startSession;
    private String endSession;
    private int moneyBeforeSession;
    private int moneyAfterSession;
    private int netIncome;
    private int grossIncome;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getStartSession() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(dtf.format(currentTime));
        return dtf.format(currentTime);
    }

    public void setStartSession(String startSession) {
        this.startSession = startSession;
    }

    public String getEndSession() {
        return endSession;
    }

    public void setEndSession(String endSession) {
        this.endSession = endSession;
    }

    public int getMoneyBeforeSession() {
        return moneyBeforeSession;
    }

    public void setMoneyBeforeSession(int moneyBeforeSession) {
        this.moneyBeforeSession = moneyBeforeSession;
    }

    public int getMoneyAfterSession() {
        return moneyAfterSession;
    }

    public void setMoneyAfterSession(int moneyAfterSession) {
        this.moneyAfterSession = moneyAfterSession;
    }

    public int getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(int netIncome) {
        this.netIncome = netIncome;
    }

    public int getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(int grossIncome) {
        this.grossIncome = grossIncome;
    }
}
