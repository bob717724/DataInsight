import java.util.Locale;

public class ScoreStatistics {
    public static void printStatistics(int[] scores) {
        int count = 0;
        int sum = 0;
        int passed = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] grades = new int[4]; // A、B、C、D

        for (int score : scores) {
            if (score < 0 || score > 100) {
                continue;
            }
            count++;
            sum += score;
            if (score >= 60) {
                passed++;
            }
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }

            if (score >= 90) {
                grades[0]++;
            } else if (score >= 80) {
                grades[1]++;
            } else if (score >= 60) {
                grades[2]++;
            } else {
                grades[3]++;
            }
        }

        if (count == 0) {
            System.out.println("有效 0 条  总分 0  平均 无  最高 无  最低 无  及格率 无");
        } else {
            System.out.printf(Locale.US,
                    "有效 %d 条  总分 %d  平均 %.2f  最高 %d  最低 %d  及格率 %.1f%%%n",
                    count, sum, (double) sum / count, max, min,
                    passed * 100.0 / count);
        }
        System.out.printf("A档(90+) %d 人  B档(80-89) %d 人  C档(60-79) %d 人  D档(<60) %d 人%n",
                grades[0], grades[1], grades[2], grades[3]);
    }

    public static void main(String[] args) {
        int[] scores = {88, 92, 76, -1, 59, 120, 95, 63, 100, 45};
        printStatistics(scores);
    }
}
