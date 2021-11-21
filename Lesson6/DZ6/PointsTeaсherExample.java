package Lesson6.DZ6;

//См. 00:40:00 минуту видеоурока

public class PointsTeaсherExample {
    public static void main(String[] args) {
        String str1 = new String("   Предложение один    Предложение   два          Предложение  три    ");
        System.out.println(str1);
        String str2 = str1.trim();
//        System.out.print("/");
        System.out.print(str2);
//        System.out.println("/");

        String str3 = str2.replaceAll(" +", " ");
        System.out.println(str3);

        StringBuilder stringBuilder = new StringBuilder(str3);

        for (int i = str3.length() - 1; i >= 1; i--) { //Цикл идет с конца строки, чтобы правильно сработал insert
            if (str3.charAt(i) >= 'А' && str3.charAt(i) <= 'Я') {
                stringBuilder.setCharAt(i - 1, '.'); //Ставится точка перед заглавной
                stringBuilder.insert(i, ' '); //Добавляем пробел перед заглавной
            }
        }

        stringBuilder.append('.'); // Добавляется точка в конце строки
//        stringBuilder.delete(0, 2); // Удаляются ". " в начале предложения

        System.out.println(stringBuilder.toString());
    }
}
