public class Dog extends Animal {

    Dog(String name, char sex) {
        super(name, sex);
        setSex(sex);
    }

    @Override
    char setSex(char sex) {
        return super.setSex(checkSex(sex));
    }

    private char checkSex(char sex) {
        if( sex == 'M' || sex == 'F' ) {
            return sex;
        }
        return 'M';
    }
}
