public class Patient {
    String name;
    double Weight;
    double height;


    public Patient (String n, double w, double h) {
        name = n;
        Weight = w;
        height = h;
    }

    public double CallBMI() {
        return Weight / Math.pow(height / 100, 2);
    }
        public String getStatus(){
            double bmi = CallBMI();
            if (bmi < 18.5) {
                return "Underweight";
            } else if (bmi < 25) {
                return "Normal weight";
            } else if (bmi > 50) {
                return "Overweight";
            } else {
                return "Obese";
            }
        }
    }


