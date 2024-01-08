public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        public String getName() {
                return name;
        }

        public void setName(String aName) {
                this.name = aName;
        }

        public int getStudentId() {
                return studentId;
        }

        public void setStudentId(int aStudentId) {
                this.studentId = aStudentId;
        }

        public int numberOfCredits() {
                return numberOfCredits;
        }

        public void setNumberOfCredits(int aNumberOfCredits) {
                this.numberOfCredits = aNumberOfCredits;
        }

        public double gpa() {
                return gpa;
        }

        public void setGpa(int aGpa) {
                this.gpa = aGpa;
        }


        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        public Student(String name, int studentId) {
                this(name, studentId, 0, 0);
        }


}
