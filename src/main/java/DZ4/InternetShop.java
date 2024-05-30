package DZ4;

import DZ4.Classes.*;
import DZ4.Exeptions.*;

public class InternetShop {
    private final static Customer[] people = {
            new Customer("Ivan", 20, "+1-222-333-44-55"),
            new Customer("Petr", 30, "+2-333-444-55-66"),
    };
    private final static Item[] items = {
            new Item("Ball", 100),
            new Item("Sandwich", 1000),
            new Item("Table", 10000),
            new Item("Car", 100000),
            new Item("Rocket", 10000000)
    };
    private static Order[] orders = new Order[5];

    //        3. Создать статический метод «совершить покупку» со строковыми параметрами,
//        соответствующими полям объекта заказа. Метод должен вернуть объект заказа.
//        4. Если в метод передан несуществующий покупатель – метод должен выбросить
//        исключение CustomerException, если передан несуществующий товар, метод
//        должен выбросить исключение ProductException, если было передано отрицательное или слишком больше значение количества (например, 100), метод
//        должен выбросить исключение AmountException.
    public static Order deal(Customer c, Item i, int a) {

        if (!searchingElArr(people, c)) throw new CustomerException("Такого Покупателя НЕТ!!");

        if (!searchingElArr(items, i)) throw new ProductException("Такого Подукта НЕТ!!");

        if (a <= 0 || a > 100) throw new AmountException("Некоректное колличество");

        return new Order(c, i, a);
    }

    private static boolean searchingElArr(Object[] array, Object o) {
        for (Object object : array) if (object.equals(o)) return true;
        return false;
    }

    private  static  Object[][] info = {
            {people[0], items[0], 1}, //good
            {people[1], items[1], -1}, //bad amount -1
            {people[0], items[2], 150}, //bad amount >100
            {people[1], new Item("Flower", 10), 1}, //no item
            {new Customer("Fedor", 40, "+3-444-555-66-77"), items[3], 1}, //no customer
    };

    public static void shop() {
        int capacity = 0;
        int i = 0;
        while (capacity != orders.length - 1 || i != info.length) {
            try {
                orders[capacity] = deal((Customer) info[i][0], (Item) info[i][1], (int) info[i][2]);
                capacity++;
            } catch (ProductException e) {
                e.printStackTrace();
            } catch (AmountException e) {
                orders[capacity++] = deal((Customer) info[i][0], (Item) info[i][1], 1);
            } catch (CustomerException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Orders made: " + capacity);
            }
            ++i;
        }
    }
}


