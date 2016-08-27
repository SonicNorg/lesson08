package annotations;

/**
 * Created by Norg on 27.08.2016.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Truck truck = new Truck("MERCEDES");
        new A().print(truck);
    }
}
