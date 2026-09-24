import java.util.Locale;

public class ClassStatistics {
    public static void printStatistics(String[] classes, int[][] scores) {
        if (classes.length != scores.length) {
            throw new IllegalArgumentException("班级名称与成绩数组数量不一致");
        }
        int gradeMax = Integer.MIN_VALUE;
        boolean hasValidScore = false;

        for (int classIndex = 0; classIndex < classes.length; classIndex++) {
            int count = 0;
            int sum = 0;
            for (int score : scores[classIndex]) {
                if (score < 0 || score > 100) {
                    continue;
                }
                count++;
                sum += score;
                if (score > gradeMax) {
                    gradeMax = score;
                }
                hasValidScore = true;
            }
            if (count == 0) {
                System.out.printf("%-8s  有效 0 条  平均 无%n", classes[classIndex]);
            } else {
                System.out.printf(Locale.US, "%-8s  有效 %d 条  平均 %.2f%n",
                        classes[classIndex], count, (double) sum / count);
            }
        }
        System.out.println("全年级最高分 = " + (hasValidScore ? gradeMax : "无"));
    }

    public static void main(String[] args) {
        String[] classes = {"软件2301", "软件2302", "大数据2301"};
        int[][] scores = {
                {88, 92, 76, 60, 55},
                {95, 83, 71, -1, 120, 66},
                {90, 90, 45, 100}
        };
        printStatistics(classes, scores);
    }
}
