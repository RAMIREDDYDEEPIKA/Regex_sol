package regexDoc;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateFileNames
{
    public static void main(String[] args)
    {
        String input="deep.txt fgh.12h uyg.pdf vbnkj cghjk jiug.doc";
        String regex="[a-zA-Z0-9_]+(\\.[a-zA-Z]{3,4})";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        List<String> data=new ArrayList<>();

        while(matcher.find()){
            data.add(matcher.group());
        }
        System.out.println("correct file formatted filenames :"+data);
    }
}