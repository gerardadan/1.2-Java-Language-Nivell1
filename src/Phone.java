public class Phone {
    String marca;
    String model;

    public Phone(String marca, String model)
    {
        this.marca = marca;
        this.model = model;
    }

    public void phonecall(String phoneNumber)
    {
        System.out.println("S'ha trucat al número " + phoneNumber);
    }
}
