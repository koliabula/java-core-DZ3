package DZ4.Classes;

import lombok.Setter;

public class Customer {
    String name;
    int age;
    String phone;

    public Customer(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Покупатель {имя='" + name + '\'' + ", возраст=" + age + ", телефон='" + phone + "'}";
    }


}
