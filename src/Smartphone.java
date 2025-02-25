public class Smartphone extends Phone implements Camera, Watch {
    public Smartphone(String marca, String model)
    {
        super(marca, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("S’està fent una foto");
    }

    @Override
    public void alarm() {

        System.out.println("Està sonant l’alarma");
    }
}
