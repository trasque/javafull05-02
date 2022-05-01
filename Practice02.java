import java.time.LocalDateTime;     //課題3で使用

public class Practice02 {
    public static void main(String[] args) {
        //課題1：String型変数を使ってHelloWorldを出力
        String greeting = "HelloWorld";
        System.out.println(greeting);

        //課題2：1～10までを足して出力　Forで4行以内 -> 今のところ5行？
        int sum = 0;
        for (int count = 1; count < 11; count++) {
            sum = sum + count;
        }
        System.out.println(sum);

        //課題3：3年後の今日の曜日
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime TYL = LocalDateTime.of(today.getYear() + 3, today.getMonth(), today.getDayOfMonth(), 0, 0);   //Three Years Later.
        System.out.println(TYL.getDayOfWeek());
    }
}
