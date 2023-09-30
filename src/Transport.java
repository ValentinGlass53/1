public class Transport {
    public float speed;
    public int weight;
    public String  color;
    public byte[] coordinate;

    public void SetValues(float _speed, int _weight, String _color, byte[] _coordinate){
        speed = _speed;
        weight = _weight;
        coordinate = _coordinate;
        color = _color;
    }
    public String getValues(){
        String info = "Object speed - " + speed + "\nObject weight -" + weight + "\nObject color - " + color;
        String infoCoordinate = "\nObject coordinate -\n";
        for(int i = 0; i < coordinate.length; i++)
          infoCoordinate += coordinate[i] + "\n";

        return info + infoCoordinate;
    }
}
