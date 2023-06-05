/*
Домашняя работа №2

1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа
(типа float), и возвращает введенное значение. Ввод текста вместо числа
не должно приводить к падению приложения, вместо этого, необходимо повторно
запросить у пользователя ввод данных.

2. Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

3. Дан следующий код, исправьте его там, где требуется
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Задание №1
        //System.out.println(inputNamberFloat());

        /*Задание №2
        Если необходимо, исправьте данный код из задачи 2
        https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
        */

        //Предположим что:
        //Integer[] intArray = new Integer[] {1,2,3,4,5,6,7,8,9};

        /*
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        */

        /*
        Ответ:
        Если цель получать каждый раз при выполнении кода/программы
        ArithmeticException и Integer[] intArray = new Integer[] {1,2,3,4,5,6,7,8,9};
        то есть мы будем иметь 8ой элемент в массиве intArray нечего менять не надо
        (все, итак, криво/косо, но работать будет).

        Если же количество элементов в intArray не известно перед выполнением
        операции я бы добавил:
        */

        //Предположим что:
        //Integer[] intArray = new Integer[] {1,2,3,4,5,6,7,8};

        /*
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        //А это уже совсем на всякий случай (для совсем непредвиденных ситуаций):
        catch (RuntimeException e) {
            System.out.println("Catching exception: " + e);
        }
        */

        /*
        P.S.: Конечно неплохо было бы избавиться от деления на 0, но
        чем его заменить - ?
         */

        /*Задание №3
        Дан следующий код, исправьте его там, где требуется
        (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
        */

        //Было:
        /*
        public static void main(String[] args) throws Exception {
             try {
                    int a = 90;
                    int b = 3;
                    System.out.println(a / b);
                    printSum(23, 234);
                    int[] abc = { 1, 2 };
                    abc[3] = 9;
             } catch (Throwable ex) {
                    System.out.println("Что-то пошло не так...");
             } catch (NullPointerException ex) {
                    System.out.println("Указатель не может указывать на null!");
             } catch (IndexOutOfBoundsException ex) {
                    System.out.println("Массив выходит за пределы своего размера!");
            }
         }

        public static void printSum(Integer a, Integer b) throws FileNotFoundException {
           System.out.println(a + b);
        }
        */

        //Исправлено:
        /*
        public static void main(String[] args) {
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = {1, 2};
                abc[3] = 9;
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            }
        }

        public static void printSum(int a, int b) {
            System.out.println(a + b);
        }
        */

        /*
        Небольшое пояснение к решению задачи №3:
        В данном коде/(куске кода) именно с этими магическими числами (этими переменными) не вижу смысла в:
        1. catch (NullPointerException ex) { System.out.println("Указатель не может указывать на null!"); }
        на "своем месте" не мешает выполнению кода однако не вижу ситуации
        при которой оно может "пригодиться" так как в приведенном куске кода
        просто не присвоено null не одной переменной.

        2. catch (Throwable ex) { System.out.println("Что-то пошло не так..."); } единственная
        ситуация которая спровоцирована в коде это IndexOutOfBoundsException. Конечно Throwable ex не помешает
        выполнению кода, но и смысла в нем не вижу (да и если бы я ставил исключения такого рода
        то спустился бы на уровень Exception или RuntimeException (какой смысл забираться так высоко аж к Throwable
        родителю всех исключений)).
        */

        //Задание №4
        System.out.println("Эхо:" + dialogueWithUser());

    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    /*
    1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа
    (типа float), и возвращает введенное значение. Ввод текста вместо числа
    не должно приводить к падению приложения, вместо этого, необходимо повторно
    запросить у пользователя ввод данных.
    */

    public static float inputNamberFloat() {

        while (true) {
            System.out.print("\n"+ "Введите дробное число типа float: ");

            Scanner inData = new Scanner(System.in);

            String inDataString = replacingOneCommaWithDot(inData);

            try {
                return Float.parseFloat(inDataString);
            }
            catch (NumberFormatException message) {
                message.printStackTrace();
                System.out.println("Вы ввели не число в следствии чего вызвали NumberFormatException");
            }
            catch (RuntimeException message) {
                message.printStackTrace();
                System.out.println("При вводе данных произошёл сбой!");
                /*
                Подниматься по иерархии исключений в Exception выше не вижу смысла
                */
            }
        }
    }

    private static String replacingOneCommaWithDot(Scanner inData) {

        //nextLine() - что бы можно было ввести пустую строку
        String inDataString = inData.nextLine();
        //String inDataString = inData.next();

        int countPoint = 0;

        boolean flagForCountPoint = inDataString.contains(",");

        if (flagForCountPoint) {
            String[] splitForCountPoint = inDataString.split("\\,");
            countPoint = splitForCountPoint.length - 1;
        }

        if (countPoint == 1) {
            inDataString = inDataString.replace("," , ".");
        }

        return inDataString;
    }

    /*
    4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    */

    public static String dialogueWithUser() {

        while (true) {
            try {
                return inputString();
            }
            catch(Exception message) {
                System.out.println(message.getMessage());
            }
        }
    }

    private static String inputString() throws Exception {

            System.out.print("\n"+ "Введите строку: ");

            Scanner inData = new Scanner(System.in);

            String inDataString = inData.nextLine();

            if ( inDataString.isEmpty() || inDataString.trim().isEmpty() ) {
                throw new Exception("Пустую строку или строку из одних пробелов вводить нельзя");
                //Можно без проблем шагнуть на уровень ниже что бы не использовать throws Exception:
                //throw new RuntimeException("Пустую строку или строку из одних пробелов вводить нельзя");
                //но в задании четко сказано использовать Exception:
            }

            return inDataString;
    }

}