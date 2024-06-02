package Day2.Day_02_Activities.clacGrade;

public class MyMethods {

    public static double ClaculatePercentage(double mark, double fullMark){
        return mark / fullMark * 100;
    }

    public static String marksResult(double Percentage){
        if(Percentage > 85) return "Execllent";
        else if(Percentage > 75) return "Very Good";
        else if(Percentage > 65) return "Good";
        else if(Percentage >= 50) return "Pass";
        else return "Fail";
    }

//    public static String[] marksResult(double [] Percentages) {
//        var sc = new String[Percentages.length];
//        for (int i = 0; i < Percentages.length) {
//            if (Percentage > 85) return "Execllent";
//            else if (Percentage > 75) return "Very Good";
//            else if (Percentage > 65) return "Good";
//            else if (Percentage >= 50) return "Pass";
//            else return "Fail";
//        }
//    }
}
