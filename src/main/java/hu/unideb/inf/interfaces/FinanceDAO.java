package hu.unideb.inf.interfaces;

import hu.unideb.inf.entity.Finance;

import java.util.List;

public interface FinanceDAO extends AutoCloseable
{
    void saveFinance(Finance f);
    void deleteFinance(Finance f);
    void updateFinance(Finance f);
    List<Finance> getFinances();
}
