package Task3;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<People> people = Arrays.asList(
                new People("Кирилл",26,"Middle java dev","150000 руб"),
                new People("Виталий",28,"Senior java automation QA","2000$"),
                new People("Александр",31,"junior functional tester","50000 руб"),
                new People("Дементий",35,"dev-ops","1500$")
        );

        System.out.println("--Вывести имена всех сотрудников, младше 30.");
        people.stream().filter(p->p.getAge()<30).forEach(p-> System.out.println(" "+p.getName()));

        System.out.println("--Вывести имена всех сотрудников, получающих зарплату в рублях.");
        people.stream().filter(p1->p1.getSalary().contains("руб")).forEach(p1-> System.out.println(" "+p1.getName()));

        //Средний возраст всех сотрудников
        double manAverageAge = people.stream().mapToInt(People::getAge).average().getAsDouble();
        System.out.println("--Средний возраст всех сотрудников = " + manAverageAge);

    }
    private static class People {
        private final String name;
        private final int age;
        private final String post;
        private final String salary;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSalary() {
            return salary;
        }


        public People(String name, int age, String post, String salary) {
            this.name = name;
            this.age = age;
            this.post = post;
            this.salary = salary;
        }
    }
}
