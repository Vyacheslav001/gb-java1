package Lesson6.VideoLesson;

public class MainClassString {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Java");

        stringBuffer.append(" Hello");
        System.out.println(stringBuffer.toString());
        char c = stringBuffer.charAt(0);
        System.out.println(c);

        stringBuffer.setCharAt(0, 't');

        System.out.println(stringBuffer.toString());

        String res = stringBuffer.substring(2, 7);
        System.out.println(res);

        String s = "Предложение один    Предложение   два          Предложение  три";

        String s1 = s.replaceAll(" +", "  ");
        String s2 = s1.replaceAll("  П", ". П");
        String s3 = s2.replaceAll(" +", " ");
        String s4 = ".";
        String s5 = s3 + s4;

//        String s3 = s1.
//
//        setPointStr(s1);
        System.out.println(s5);
    }

//    public static void setPointStr(String s){
//        for (int i = 0; i < s.length()-2; i++) {
//            if (s.charAt(i+2) == 'П'){
//                s.charAt(i).replace(".", " ");
//            }
//        }
//    }

}
