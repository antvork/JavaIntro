package Lesson.lesson4;

import java.util.Stack;

import Traning.swichcase;

// LIFO — "last in — first out" (“последним пришел — первым вышел”). STACK
public class _Stack {

    private static boolean isDigit(String s) throws NumberFormatException { // метод проверки строки на число,
                                                                            // NumberFormatException - исключение если
                                                                            // символы строки нельзя преобразовать в
                                                                            // число
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        // вычислить значение выражения в постфиксной форме записи 1+2*3 = 123*+ и
        // (1+2)*3 = 12+3*

        // var exp = "1 2 3 * +".split(" "); // 1+2*3 // массив строк
        // var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        var exp = "5 5 **".split(" "); // 5**5

        int res = 0;
        for (String string : exp) {
            System.out.println(string);
        }
    

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i])); //.push помещает элемент в начало стека // Если значение число то заносим в стек, > 123 в стеке все лежит наоборот 3, 2, 1

            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();// .pop Удаляет объект наверху этого стека и возвращает этот объект как значение этой функции. те берем 3 и 2 плюсуем их
                        st.push(res); // результат заносим в стек те 5, 1
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.println(st.pop());

    }

}
