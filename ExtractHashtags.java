package regexDoc;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractHashtags
{
    public static void main(String[] args)
    {
        String input="This is #codi_ng a #_beautiful #456world of #tech";
        String regex="#\\w{2,}";
        Pattern pattern=Pattern.compile(regex);
        List<String> hashTags=new ArrayList<>();
        Matcher matcher=pattern.matcher(input);

        while(matcher.find()) {
            hashTags.add(matcher.group());
        }
        System.out.println("Extracting the hashtags: "+hashTags);
    }
}