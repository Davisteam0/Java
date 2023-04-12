public class TestStudents {
    public static void main(String[] args) {
        Students student = new Students();
        student.setName("牛津创");
        student.setId("2106011016");
        student.setSex("Male");
        student.setAge(20);
        student.setScore(59);
        student.study();
        student.introduce();
    }
}
