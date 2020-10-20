package misc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Folders {

    // captures everything between folder name = " this match "
    private final static String regexFolderMatcher = "folder name=\"(.*?)\"";

    public static Collection <String> folderNames(String xml, char startingLetter) throws Exception {
        Collection <String> names = new ArrayList <>();
        Pattern pattern = Pattern.compile(regexFolderMatcher);
        Matcher matcher = pattern.matcher(xml);
        while (matcher.find()) {
            if (matcher.group(1).toLowerCase().startsWith( String.valueOf(startingLetter).toLowerCase() )) {
                names.add(matcher.group(1));
            }
        }
        return names;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"Users\" />" +
                        "</folder>";

        Collection <String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}