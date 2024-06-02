public class MethodMarks {
    public static double CalcuMarks (double Mark, double fullMark) {
        return (Mark / fullMark) * 100;

    }
        public static String getFullMark ( double Result){
            if (Result > 85) return "Exellent";
            else if (Result > 75) return "Very good";
            else if (Result > 65) return "good";
            else if (Result >= 50) return "pass";
            else return "Fall";
        }



    }

