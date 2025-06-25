public class task5 {
    public static void main(String[] args) {
        int age = 10;
        boolean hasAdult = true;


        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            if (hasAdult) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе без взрослого");
            }
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("Неизвестный возраст: " + age);
        }
    }
}