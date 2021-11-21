package Lesson6.DZ6;

public class Points {
    public static void main(String[] args) {
    String s = "пПредложение один    Предложение   два          Предложение  три";

            if (s.charAt(0) > s.charAt(1)){
                System.out.println("п польше П");
            }else
                System.out.println("П польше п");
        }

//    String s1 = s.replaceAll(" +", "  ");
//    String s2 = s1.replaceAll("  П", ". П");
//    String s3 = s2.replaceAll(" +", " ");
//    String s4 = ".";
//    String s5 = s3 + s4;
//
////        String s3 = s1.
////
////        setPointStr(s1);
//        System.out.println(s5);
//}
//
//    public static void setPointStr(String s){
//        for (int i = 0; i < s.length()-2; i++) {
//            if (s.charAt(i+2) == 'П'){
//                s.charAt(i).replace(".", " ");
//            }
//        }

}
