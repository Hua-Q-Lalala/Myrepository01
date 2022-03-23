package year2022.january.day27;

import java.net.SocketTimeoutException;

/**
 * 2047. 句子中的有效单词数
 * @create 2022-01-27 23:29
 */
public class Test2047 {

    public static void main(String[] args) {
        String sentence = "b-a-c f-d";
        //int i = sentence.indexOf("-");
        //System.out.println(i);
        //System.out.println(sentence.charAt(i));
        //System.out.println("-".equals(sentence.charAt(i)+""));
        int i = new Test2047().countValidWords(sentence);
        System.out.println(i);

    }

    public int countValidWords(String sentence) {
        int count = 0;

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++){
            boolean flag = true;
            String word = words[i];

            if ("".equals(word)){
                continue;
            }
            if(word.contains("!") || word.contains(".") || word.contains(",")){
                if (word.contains("!") && word.indexOf("!") != word.length()-1){
                    continue;
                }
                if (word.contains(".") && word.indexOf(".") != word.length()-1){
                    continue;
                }
                if (word.contains(",") && word.indexOf(",") != word.length()-1){
                    continue;
                }

                for (int j = 0; j < word.length()-1; j++){
                    if("-".equals(word.charAt(j)+"")){
                        continue;
                    }
                    if (word.charAt(j) <97 || word.charAt(j) > 122){
                        flag = false;
                        break;
                    }
                }
            }else if(word.contains("-")) {
                if (word.contains("-") && (word.indexOf("-") == 0 || word.indexOf("-") == word.length()-1)){
                    continue;
                }
                int from = -1;
                int number = 0;
                for (int n = 0; n < word.length(); n++){
                    from = word.indexOf("-", from + 1);
                    if (from == -1){
                        break;
                    }
                    if (from > 0){
                        number++;
                    }
                }
                System.out.println(number);
                if (number > 1){
                   continue;
                }
                for (int j = 0; j < word.length(); j++){
                    if("-".equals(word.charAt(j)+"")){
                        continue;
                    }
                    if (word.charAt(j) <97 || word.charAt(j) > 122){
                        flag = false;
                        break;
                    }
                }
            }else {
                for (int j = 0; j < word.length(); j++){
                    if (word.charAt(j) <97 || word.charAt(j) > 122){
                        flag = false;
                        break;
                    }
                }
            }

            if(flag){
                count++;
            }
        }

        return count;

    }
}
