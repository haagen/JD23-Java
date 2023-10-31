public class Animal {

    private String name;
    private int age=0;
    private char sex;    // 'M', 'F', 'H

    Animal(String name, char sex) {
        this.name = name;
        setSex(sex);
    }

    public void info() {
        String className = this.getClass().getName();
        System.out.printf("%s [name: %s, age: %d, sex: %s]\n", className, name, age, sex);
    }

    char getSex(){
        return sex;
    }

    char setSex(char sex) {
        if( sex == 'M' || sex == 'F' || sex == 'H') {
            this.sex = sex;
        }
        return this.sex;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}
