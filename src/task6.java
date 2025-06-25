public class task6 {
    public static void main(String[] args) {
        int totalCapacity = 102;
        int seatedPlaces = 60;
        int standingPlaces = totalCapacity - seatedPlaces;

        int passengers = 85;

        if (passengers < 0) {
            System.out.println("Ошибка: количество пассажиров не может быть отрицательным");
        } else if (passengers <= seatedPlaces) {
            System.out.println("В вагоне есть сидячее место. Свободно: " + (seatedPlaces - passengers) + " сидячих мест");
        } else if (passengers <= totalCapacity) {
            System.out.println("Сидячих мест нет, но есть стоячее место. Свободно: " + (totalCapacity - passengers) + " стоячих мест");
        } else {
            System.out.println("Вагон полностью забит. Мест нет.");
        }
    }
}
