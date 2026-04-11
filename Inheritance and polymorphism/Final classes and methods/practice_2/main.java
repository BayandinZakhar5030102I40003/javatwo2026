// final-класс - нельзя наследоваться
final class MathConstants {
    public static final double PI = 3.14159;

    public double square(double x) {
        return x * x;
    }
}

// попытка создать подкласс от final-класса приведет к ошибке
/*
class Math extends MathConstants {  //
    public double cube(double x) {
        return x * x * x;
    }
}
*/

//  обычный класс, можно наследоваться
class RegularClass {
    public void show() {
    }
}

class SubClass extends RegularClass {  // работает
    @Override
    public void show() {
    }
}