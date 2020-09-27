public class D6 {
    final byte MIN = 1;
    final byte MAX = 6;

    private byte value;

    public D6(){
        value = 1;
    }

    public void setValue(byte x) throws Exception{
        if (x < MIN || x > MAX){
            throw new Exception("value beyond limits");
        }
        value = x;
    }

    public byte getValue(){
        return value;
    }
}
