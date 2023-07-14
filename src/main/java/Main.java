public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);

        //Переменная b, будучи разностью двух единиц, имеет значение ноль.
        //Переменная c — это частное от деления a на b. При делении на ноль выбрасывается ошибка.
        //Самым простым решением будет изменить значения переменных. Другой вариант — вывести предупреждение
        //о невозможности деления на ноль.
        //В метод devide добавлена проверка делителя на равенство нулю. Добавлена переменная isNull
        //с лямбда-выражением, реализующим интерфейс Function<Integer, String>

        //calc.println.accept(c);

        System.out.println(calc.isNull.apply(c));

    }
}
