package tdd.exampleOne;

public class GradeManager {
    public static final String MESSAGE_1 = "메시지1";
    public static final String MESSAGE_2 = "메시지2";
    public static final String MESSAGE_3 = "메시지3";
    //배열에 넣기
    private static double[] employeePoints = {0, 500, 1000, 1500};
    private static double[] managerPoints = {0, 2500, 3000, 3500};
    private static String[] messages = {MESSAGE_1, MESSAGE_2, MESSAGE_3};

    public static Object getGradeMessage(String position,
                                         double point,
                                         String prize) {
        String resultMessage = MESSAGE_1;
        double[] points = getPointsArrayByPosition(position);
        //isBetween 중복
        for (int i = 0; i < points.length - 1; i++){
            if (isBetween(point, points[i], points[i + 1]))
                resultMessage = messages[i];
        }
        return resultMessage;
    }

    // 직무체크 로직 중복 제거
    private static double[] getPointsArrayByPosition(String position) {
        return position.equals("사원") ? employeePoints : managerPoints;
    }

    //포인트가 사이에 있는지 체크(중복 제거)
    private static boolean isBetween(double point, double sameAndUpperThan, double belowThan) {
        return sameAndUpperThan <= point && point < belowThan ? true : false;
    }
}
