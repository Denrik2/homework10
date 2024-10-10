public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = firstName + " " + middleName + " " + lastName;
        //Задание 2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //Задание 3
        fullName = "Иванов Семён Семёнович";
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) != 'ё' && fullName.charAt(i) != 'Ё') {
                fullName = fullName.replace("ё", "е");
                fullName = fullName.replace("Ё", "Е");
            }
        }
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
        }




