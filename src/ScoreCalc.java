import java.util.Locale;

public class ScoreCalc {
    public static void main(String[] args) {
        long id = 2023001L;
        String name = "张三";
        int math = 88;
        int chinese = 92;
        int english = 76;

        int total = math + chinese + english;
        double average = total / 3.0;
        boolean passed = average >= 60;

        double automaticConversion = math; // int 自动转换为 double
        int forcedConversion = (int) average; // double 强制转换为 int，舍去小数
        byte overflow = (byte) 300; // 超出 byte 范围后只保留低 8 位

        System.out.printf(Locale.US, "学号：%d  姓名：%s%n", id, name);
        System.out.printf(Locale.US,
                "数学：%d  语文：%d  英语：%d  总分：%d  平均分：%.2f  及格：%s%n",
                math, chinese, english, total, average, passed);
        System.out.printf(Locale.US, "自动转换 int→double：%.1f%n", automaticConversion);
        System.out.printf("强制转换 double→int：%d%n", forcedConversion);
        System.out.printf("byte 溢出：(byte)300 = %d%n", overflow);
        System.out.printf("平均分等级：%s%n", grade(average));
    }

    public static String grade(double average) {
        if (average >= 90) {
            return "优秀";
        } else if (average >= 80) {
            return "良好";
        } else if (average >= 60) {
            return "及格";
        }
        return "不及格";
    }
}
