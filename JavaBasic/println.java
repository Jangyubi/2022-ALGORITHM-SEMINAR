public class println {
    public static void main(String[] ar) {

    System.out.println("출력");
    System.out.println("안녕");
    System.out.println(1 + 1); // 기본자료형

    int a = 1;
    String b = "안녕";
    System.out.println(a);
    System.out.println(b);

    // 자료형 순서
    System.out.println("화면" + 1 + 1); 
    System.out.println(1 + 1 + "화면");

    // 한줄출력
    System.out.print("안녕");
    System.out.print("하세요\n"); 

    // 형식출력
    System.out.printf("%d\n", 30); // 10진수
    System.out.printf("%o\n", 30); // 8진수
    System.out.printf("%x\n", 30); // 16진수
    System.out.printf("%f\n", 30); 
    


    }
}
