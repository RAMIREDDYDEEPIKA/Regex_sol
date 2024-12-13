package regexDoc;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateData
{
    public static void main(String[] args) {

        String input="this is this not is those okay";
        String regex="[a-zA-Z0-9]{1,}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        HashSet<String> dupli=new HashSet<>();
        HashSet<String> nonDupli=new HashSet<>();

        while(matcher.find()){

            String word= matcher.group().toLowerCase();
            if(nonDupli.contains(word)){
                dupli.add(word);
            }
            else{
                nonDupli.add(word);
            }
        }
        System.out.println("Duplicated data: "+dupli);
    }
}