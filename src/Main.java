public class Main {
    public static void main(String[] args) {
        Transport oveo = new Transport();
        oveo.SetValues(130.5f, 1300, "red",new byte[] {0,0,0});
        System.out.println(oveo.getValues());
        //oveo.getValues();

        Transport niva = new Transport();
        niva.speed = 110.5f;
        niva.color = "black";
        niva.weight = 2100;
        niva.coordinate = new byte[] {1, 1, 1};
        System.out.println(niva.getValues());


    }
}
//