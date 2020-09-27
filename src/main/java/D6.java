public class D6 {
    final byte MIN = 1;
    final byte MAX = 6;

    private byte value;

    public D6() {
        this((byte) 1);
    }

    public D6(byte value) {
        if (isDiceValue(value))
            this.value = value;
        else
            this.value = 1;
    }

    public void setValue(byte x) throws Exception{
        if (!isDiceValue(x)){
            throw new Exception("value beyond limits");
        }
        value = x;
    }

    private boolean isDiceValue(byte x){
        if (x < MIN || x > MAX){
            return false;
        }
        return true;
    }

    public byte getValue(){
        return value;
    }
}
