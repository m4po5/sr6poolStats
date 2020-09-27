public class PoolChecker {
    static int checkSuccesses(D6[] pool){
        int count = 0;
        for (D6 die: pool
             ) {
            if (die.getValue() >= 5)
                count++;
        }
        return count;
    }
}
