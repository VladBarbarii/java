public class Main {

    public static void main(String[] args) {

        Car mercedes = new Mercedes();
        Car mustang = new Mustang();

        Person person = new Person();
        person.drive(mustang);
        person.drive(mercedes);

    }
}
