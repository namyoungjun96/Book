package chap01;

import java.util.ArrayList;
import java.util.HashMap;

public class TransactionFilter {
    public void notUsedStream() {
        Map<Currency, List<Transaction>> transactionByCurrencies = new HashMap<>();

        for(Transaction transaction : transactions) {
            if(transatcion.getPrice() > 1000) {
                Currency currency = transaction.getCurrency();
                List<Transaction> transactionsForCurrency = transactionByCurrencies.get(currency);

                if (transactionsForCurrency == null) {
                    transactionsForCurrency = new ArrayList<>();
                    transactionByCurrencies.put(currency, transactionsForCurrency);
                }
                transactionsForCurrency.get(transaction);
            }
        }
    }

    public void useStream() {
        Map<Currency, List<Transaction>> transactionByCurrencies =
                transaction.stream().filter((Transaction t) -> t.getPrice() > 1000)
                        .collect(groupingBy(Transaction::getCurrency));
    }
}
