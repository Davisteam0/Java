public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("闯子");
        student1.setScore(90);

        Student student2 = new Student("Jane", 85);

    System.out.println("姓名：" + student1.getName() + "，成绩：" + student1.getScore());
    System.out.println("姓名：" + student2.getName() + "，成绩：" + student2.getScore());


        }
    }

    class Student {
        private String name;
        private int score;

        public Student() {

        }

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getScore() {
            return score;
        }
    }
