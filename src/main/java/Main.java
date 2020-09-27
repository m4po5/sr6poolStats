public class Main {

    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Please enter dicepool size.");
        }

        int poolSize = Integer.parseInt(args[0]);

        int[] stats = StatsCollector.main(poolSize);

        for (int i = 0; i < stats.length ; i++) {
            String line = i + " successes: \t" + stats[i] + " \t" + String.format("%.4f",getPercentage(i, stats)) + "%";
            System.out.println(line);
        }
    }

    private static float getPercentage(int target, int[] stats){
        float total = 0;
        float part = 0;

        for (int i = 0; i < stats.length; i++) {
            total += stats[i];
            if (i >= target)
                part += stats[i];
        }

        float perc = (part / total) * 100;

        return perc;
    }
}
