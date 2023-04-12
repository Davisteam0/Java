public class Students {
    /*
    设计一个封装的学生类Students，并进行测试。
      1）Students类中包含姓名（name）、学号（id）、成绩（score）、性别（sex）、年龄(age)5个属性，均由private修饰符修饰；
      2）分别给这5个属性定义两个方法，一个set方法用于设置值，一个get方法用于获取值；
      3）Students类中定义2个方法，即：study()和introduce()方法。其中，study()方法在屏幕显示“我们爱学习！”，
        introduce()方法在屏幕显示“我叫XXX，性别XXX,年龄是XXX,学号XXX，我考了XX分”；
      4）编写测试类TestStudent.java，其中只包含main方法。其功能为：创建1个Students类的对象，
        然后调用set方法给姓名、学号、性别、年龄赋值自己的名字、学号、性别、年龄，给成绩赋值90，并调用study()方法和introduce()方法
*/
    public static void main(String[] args) {

    }
        private String name;
        private String id;
        private int score;
        private String sex;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSex() {
            return sex;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void study() {
            System.out.println("我不爱学习！");
        }

        public void introduce() {
            System.out.println("我叫" + name + "，性别" + sex + "，年龄是" + age + "，学号" + id + "，我考了" + score + "分");
        }
    }

