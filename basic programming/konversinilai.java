public class konversinilai {
    public static void main(String[] args) {
        int studentscore = 80;

        if (studentscore >= 80 && studentscore <= 100) {
            System.out.println("nilai A");
        } else if (studentscore >= 65 && studentscore <= 79) {
            System.out.println("nilai B+");
        } else if (studentscore >= 35 && studentscore <= 49) {
            System.out.println("nilai C");
        } else if (studentscore >= 0 && studentscore <= 34) {
            System.out.println("nilai D");
        } else {
            System.out.println("invalid");
        }

    }
}