public class GradeDemo {
    public static char gradeIfElse(int score) {
        checkScore(score);
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 60) {
            return 'C';
        } else {
            return 'D';
        }
    }

    public static char gradeSwitch(int score) {
        checkScore(score);
        switch (score / 10) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
            case 6:
                return 'C';
            default:
                return 'D';
        }
    }

    private static void checkScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("分数必须在 0 到 100 之间");
        }
    }

    public static void main(String[] args) {
        int[] samples = {0, 59, 60, 79, 80, 89, 90, 100};
        System.out.println("分数  if-else  switch");
        for (int score : samples) {
            System.out.printf("%3d      %c        %c%n",
                    score, gradeIfElse(score), gradeSwitch(score));
        }
    }
}
