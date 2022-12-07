public class Main {
    public static void main(String[] args) {
        int start1 = 0;
        int end1 = 5;
        int start2 = 0;
        int end2 = 10;
        if (start1 < start2 && end1 == start2) {
            System.out.println("Точка пересечения двух отрезков: " + end1);
        } else if (start2 < start1 && end2 == start1) {
            System.out.println("Точка пересечения двух отрезков: " + end2);
        } else if (start1 < start2 && end1 < start2) {
            System.out.println("Отрезки не пересекаются");
        } else if (start2 < start1 && end2 < start1) {
            System.out.println("Отрезки не пересекаются");
        } else if (start2 > start1 && end1 > end2) {
            System.out.println("Начало отрезка: " + start2 + ".Конец отрезка: " + end2);
        } else if (start1 > start2 && end1 < end2) {
            System.out.println("Начало отрезка: " + start1 + ".Конец отрезка: " + end1);
        } else if (start2 > start1 && start2 < end1 && end1 < end2) {
            System.out.println("Начало отрезка: " + start2 + ".Конец отрезка: " + end1);
        } else if (start1 > start2 && start1 < end2 && end1 > end2) {
            System.out.println("Начало отрезка: " + start1 + ".Конец отрезка: " + end2);
        } else if (start1 == start2 && end1 == end2) {
            System.out.println("Начало отрезка: " + start1 + ".Конец отрезка: " + end1);
        } else if (start2 > start1 && end2 == end1) {
            System.out.println("Начало отрезка: " + start2 + ".Конец отрезка: " + end1);
        } else if (start2 == start1 && end2 > end1){
            System.out.println("Начало отрезка: " + start1 + ".Конец отрезка: " + end1);
        }
    }
}
