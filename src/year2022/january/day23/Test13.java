package year2022.january.day23;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 13题
 * 罗马数字包含以下七种字符:I，V，X，L，C，D和M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做II，即为两个并列的II。12写做XII，即为X+II。 27 写做XXVII,
 * 即为X+V+II。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，
 * 所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
 * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
 * 给定一个罗马数字，将其转换成整数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @create 2022-01-23 19:25
 */
public class Test13 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int sum = 0;
        if (s.length() < 2) {
            sum += map.get(s.charAt(0) + "");
        } else {
            for (int i = 0; i < s.length(); i++) {
                String s1 = s.charAt(i) + "";

                Integer val1 = map.get(s1);
                if (i != s.length()-1) {
                    String s2 = s.charAt(i + 1) + "";
                    if("I".equals(s1)){
                        if("V".equals(s2) || "X".equals(s2)){
                            val1 = map.get(s2) - val1;
                            i++;
                        }
                    }else if("X".equals(s1)){
                        if("L".equals(s2) || "C".equals(s2)){
                            val1 = map.get(s2) - val1;
                            i++;
                        }
                    }else if("C".equals(s1)){
                        if("D".equals(s2) || "M".equals(s2)){
                            val1 = map.get(s2) - val1;
                            i++;
                        }
                    }
                }
                sum += val1;
            }
        }
        System.out.println(sum);
    }
}
