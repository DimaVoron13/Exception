public class Main {
    public static void main(String[] args) {

        try {
            ParametersServiceClass.validateParameters("admin", "34664", "34664");
        } catch (WrongLoginException e) {
            System.out.println("Неверно введен логин");
        } catch (WrongPasswordException e) {
            System.out.println("Неверно введен пароль либо пароль  не подтвержден");
        } finally {
            System.out.println("Игра окончена");
        }
    }
}