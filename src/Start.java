import controller.Controller;
public class Start {
    public static void start() {
        Controller controller = new Controller();
        controller.creatingStudent();
        controller.inputFirstName();
        controller.inputLastName();
        controller.inputClassLevel();
        controller.inputCourse();
        controller.payment();
        controller.allStats();
    }
}
