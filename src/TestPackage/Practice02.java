import java.time.LocalDateTime;     //課題3で使用
import java.util.List;          //課題5で使用
import java.util.ArrayList;     //課題5で使用
import java.util.Map;           //課題5で使用
import java.util.HashMap;       //課題5で使用

public class Practice02 {
    public static void main(String[] args) {
        //課題1：String型変数を使ってHelloWorldを出力
        System.out.println("【課題1】String型変数を使ってHelloWorldを出力");
        String greeting = "HelloWorld";
        System.out.println(greeting);
        System.out.println();

        //課題2：1～10までを足して出力　Forで4行以内 -> 今のところ5行？
        System.out.println("【課題2】1~10までを加算して出力 Forを使い4行以内とする");
        int sum = 0;
        for (int count = 1; count < 11; count++) {
            sum = sum + count;
        }
        System.out.println(sum);
        System.out.println();

        //課題3：3年後の今日の曜日
        System.out.println("【課題3】3年後の今日の曜日を出力する");
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime TYL = LocalDateTime.of(today.getYear() + 3, today.getMonth(), today.getDayOfMonth(), 0, 0);   //Three Years Later.
        System.out.println(TYL.getDayOfWeek());
        System.out.println();

        //課題4：引数が0なら偽　1なら真　と出力する
        System.out.println("【課題4】引数が0なら「偽」 1なら「真」と出力する");
        if (args[0].equals("0")) {
            System.out.println("偽");
        }
        if (args[0].equals("1")) {
            System.out.println("真");
        }
        System.out.println();

        //課題5：ListかMapを作成して出力する
        System.out.println("【課題5】ListかMapを作成して出力する");
        System.out.println("----<<LIST>>----");
        List<String> namelist = new ArrayList<String>();
        namelist.add("Takahashi");
        namelist.add("Sato");
        namelist.add("Suzuki");
        namelist.add("Morita");
        namelist.add("Tyson");
        System.out.println(namelist);

        System.out.println("----<<MAP>>----");
        Map<Integer, String> namemap = new HashMap<>();
        namemap.put(1, "Ieyasu");
        namemap.put(2, "Hidetada");
        namemap.put(3, "Iemitu");
        namemap.put(4, "Ietuna");
        namemap.put(5, "Tunayosi");
        for (int i = 1; i < 6; i++) {
            System.out.println(namemap.get(i));
        }
        System.out.println();
        
        //課題6：例外を起こし、デバッグを使う
        System.out.println("【課題6】例外を起こし、デバッグを使う");
        try {
            int[] numbers;
            numbers = new int[5];
            numbers[5] = 10;
        } catch (Exception e) {
            System.out.println("例外です");
            System.out.println(e);
        }
    }
}
