public class Main {
    public static void main(String[] args) {
        String phone = "9179448478";
        if (phone.length() == 10) {
            phone = "+7" + phone;
            System.out.println("phone = " + phone);
        } else if (phone.length() > 10) {
            System.out.println("Телефон слишком длинный");
        } else if (phone.length() < 10) {
        System.out.println("Телефон слишком короткий");

        }
    }
}