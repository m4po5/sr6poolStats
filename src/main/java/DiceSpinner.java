public class DiceSpinner {
    private D6[] pool;

    public DiceSpinner(int poolSize){
        pool = new D6[poolSize];
        for (int i = 0; i < poolSize; i++){
            pool[i] = new D6();
        }
    }

    public D6[] getPool(){
        return pool;
    }

    public String poolToString(){
        String str = "";
        for (D6 die: pool
             ) {
            str += die.getValue() + " ";
        }
        return str;
    }

    public boolean hasNext(){
        for (D6 die: pool) {
            if (die.getValue() != 6)
                return true;
        }
        return false;
    }

    public void spinUp(){
        int dieIndex = 0;
        spinDie(dieIndex);
    }

    private void spinDie(int dieIndex) {
        D6 curDie = pool[dieIndex];
        byte curDieValue = curDie.getValue();
        if (curDie.getValue() < 6) {
            try {
                curDie.setValue((byte) (curDieValue + 1));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            try {
                curDie.setValue((byte)1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(dieIndex < pool.length){
                spinDie(dieIndex+1);
            }
        }
    }
}
