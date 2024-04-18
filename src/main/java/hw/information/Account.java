package hw.information;

import hw.enums.Currency;

/**
 * 8. Написать класс Account
 * Поля:
 * - валюта счета(энам)
 * - баланс
 * - номер счета
 */
public class Account {
        private Currency currency;
        private int balance;
        private int id;

        public Account(Currency currency, int balance, int id) {
                this.currency = currency;
                this.balance = balance;
                this.id = id;
        }

        public Currency getCurrency() {
                return currency;
        }

        public void setCurrency(Currency currency) {
                this.currency = currency;
        }

        public int getBalance() {
                return balance;
        }

        public void setBalance(int balance) {
                this.balance = balance;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }
}
