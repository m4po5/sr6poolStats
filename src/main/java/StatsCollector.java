public class StatsCollector {
    public static int[] main(int poolsize){
        int[] stats = new int[poolsize + 1];
        for (int i = 0; i < poolsize + 1; i++) {
            stats[i] = 0;
        }

        DiceSpinner spinner = new DiceSpinner(poolsize);

        while (spinner.hasNext()){
            stats[PoolChecker.checkSuccesses(spinner.getPool())]++;
            spinner.spinUp();
        }

        stats[PoolChecker.checkSuccesses(spinner.getPool())]++;

        return stats;
    }

}
