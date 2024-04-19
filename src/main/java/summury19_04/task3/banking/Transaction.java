package summury19_04.task3.banking;

import java.time.LocalDate;

/**
 * Напишите программу,
 * которая учитывает все финансовые транзакции пользователя за месяц.
 * Пользователь вводит суммы каждой транзакции, и они добавляются в список.
 * Программа должна выводить общую сумму расходов и доходов за указанный месяц,
 * а также баланс. Суммы операций нужно хранить, используя списки List<Double> или List<BigDecimal>.
 */
public record Transaction(double sum, LocalDate date) {

}
