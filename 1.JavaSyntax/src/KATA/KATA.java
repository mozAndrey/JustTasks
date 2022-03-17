package KATA;

import java.io.IOException;
import java.lang.reflect.Executable;
import java.util.Scanner;

public class KATA {
    public static void main(String[] args) throws IOException {
        int result = 0;
        int firstNumRom, secondNumRom, firstNum, secondNum;
        Scanner inputString = new Scanner(System.in);
        String string = inputString.nextLine().toUpperCase();
        String[] arrayOfStrings = string.split(" ");
        handlingExceptions(string, arrayOfStrings);
        char[] sign = arrayOfStrings[1].toCharArray();
        if (ifRomanian(arrayOfStrings[0]) && ifRomanian(arrayOfStrings[2])) {
            firstNumRom = convertNumToArab(arrayOfStrings[0]);
            secondNumRom = convertNumToArab(arrayOfStrings[2]);
            if (arrayOfStrings[0].indexOf('-')!=-1 || arrayOfStrings[2].indexOf('-')!=-1) {
                try {
                    throw new Exception(" калькулятор не принимает на ввод отрицательные числа");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            } else if (firstNumRom > 10 ||
                    arrayOfStrings[0].indexOf('X')!=-1 & arrayOfStrings[0].indexOf('V')!=-1 ||
                    arrayOfStrings[0].indexOf('X')!=-1 & arrayOfStrings[0].indexOf('L')!=-1 ||
                    arrayOfStrings[0].indexOf('X')!=-1 & arrayOfStrings[0].indexOf('C')!=-1) {
                try {
                    throw new Exception(" калькулятор принимает на ввод числа от 1 до 10");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            } else if (secondNumRom > 10 ||
                    arrayOfStrings[2].indexOf('X')!=-1 & arrayOfStrings[2].indexOf('V')!=-1 ||
                    arrayOfStrings[2].indexOf('X')!=-1 & arrayOfStrings[2].indexOf('L')!=-1 ||
                    arrayOfStrings[2].indexOf('X')!=-1 & arrayOfStrings[2].indexOf('C')!=-1) {
                try {
                    throw new Exception(" калькулятор принимает на ввод числа от 1 до 10");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            }
            switch (sign[0]) {
                case ('-'):
                    result = firstNumRom - secondNumRom;
                    break;
                case ('+'):
                    result = firstNumRom + secondNumRom;
                    break;
                case ('*'):
                    result = firstNumRom * secondNumRom;
                    break;
                case ('/'):
                    result = firstNumRom / secondNumRom;
                    break;
                default:
                    result = -666;
            }
            if (result == -666) {
                try {
                    throw new Exception("Не правильный формат ввода данных: " + string +
                            "\n Правильный формат ввода: число (один оператор (+, -, /, *)) число");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            } else if (result < 1) {
                try {
                    throw new Exception(" в римской системе счисления нет отрицательных чисел и нуля");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            }
            if (result < 10) {
                System.out.println(convertToRom(result));
            } else {
                System.out.println(convertToRomDec(result / 10 * 10) + convertToRom(result % 10));
            }
        } else {
            firstNum = Integer.parseInt(arrayOfStrings[0]);
            secondNum = Integer.parseInt(arrayOfStrings[2]);
            if (firstNum <= 0 || secondNum <= 0 || firstNum > 10 || secondNum > 10) {
                try {
                    throw new Exception(" калькулятор принимат числа от 1 до 10 включительно");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            }
            switch (sign[0]) {
                case ('-'):
                    result = firstNum - secondNum;
                    break;
                case ('+'):
                    result = firstNum + secondNum;
                    break;
                case ('*'):
                    result = firstNum * secondNum;
                    break;
                case ('/'):
                    result = firstNum / secondNum;
                    break;
                default:
                    break;
            }
            System.out.println(result);
        }

    }

    private static void handlingExceptions(String string, String[] arrayOfStrings) {
        try {
            if (arrayOfStrings.length != 3) {
                throw new Exception("Не правильный формат ввода данных: " + string +
                        "\n Правильный формат ввода: число (один оператор (+, -, /, *)) число");

            }
            if (ifRomanian(arrayOfStrings[0]) && !ifRomanian(arrayOfStrings[2]) ||
                    ifRomanian(arrayOfStrings[2]) && !ifRomanian(arrayOfStrings[0])) {
                throw new Exception("используются одновременно разные системы счисления");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

    public static int convertNumToArab(String array1) {
        int result1 = 0;
        switch (array1) {
            case "I":
                result1 = 1;
                break;
            case "II":
                result1 = 2;
                break;
            case "III":
                result1 = 3;
                break;
            case "IV":
                result1 = 4;
                break;
            case "V":
                result1 = 5;
                break;
            case "VI":
                result1 = 6;
                break;
            case "VII":
                result1 = 7;
                break;
            case "VIII":
                result1 = 8;
                break;
            case "IX":
                result1 = 9;
                break;
            case "X":
                result1 = 10;
                break;
            case "XI":
                result1 = 11;
                break;
            case "XII":
                result1 = 12;
                break;
            case "XIII":
                result1 = 13;
                break;
            default:
                break;
        }
        return result1;
    }

    public static boolean ifRomanian(String firstNumber) {
        return firstNumber.indexOf('I') != -1 || firstNumber.indexOf('X') != -1 || firstNumber.indexOf('V') != -1;
    }

    public static String convertToRom(int arabic) {
        String result = "";
        switch (arabic) {
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 6:
                result = "VI";
                break;
            case 7:
                result = "VII";
                break;
            case 8:
                result = "VIII";
                break;
            case 9:
                result = "IX";
                break;
            case 10:
                result = "X";
                break;
            default:
                break;
        }
        return result;
    }

    public static String convertToRomDec(int arabic) {
        String result = "";
        switch (arabic) {
            case 10:
                result = "X";
                break;
            case 20:
                result = "XX";
                break;
            case 30:
                result = "XXX";
                break;
            case 40:
                result = "XL";
                break;
            case 50:
                result = "L";
                break;
            case 60:
                result = "LX";
                break;
            case 70:
                result = "LXX";
                break;
            case 80:
                result = "LXXX";
                break;
            case 90:
                result = "XC";
                break;
            case 100:
                result = "C";
                break;
            default:
                break;
        }
        return result;
    }
}


