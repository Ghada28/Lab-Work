public class TestPatient {
        public static void main(String[] args) {
            Patient x = new Patient("Ghada", 57, 162);
            Patient y = new Patient("Danah", 100, 170);

            System.out.println(x.name);
            System.out.println(x.CallBMI());
            System.out.println(x.getStatus());
            System.out.println("---------------------");
            System.out.println(y.name);
            System.out.println(y.CallBMI());
            System.out.println(x.getStatus());
    }
}
