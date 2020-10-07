package deviceFactory;

public class FactoryDevice {
    public static IDevice make(String type){
        IDevice device;
        switch (type){
            case "android": { device =new Android(); break;}
            default : device =new Android(); break;
        }
        return device;
    }
}
