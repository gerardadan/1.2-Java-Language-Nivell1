//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "galaxy");
        smartphone.phonecall("666554433");
        smartphone.alarm();
        smartphone.takePhoto();
    }
}