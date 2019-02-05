import java.util.regex.Pattern;
import java.util.regex.Matcher;
class NameValidator{
	boolean nameValidator(String filename, String filetype){
		System.out.println("file name and file type is:"+filename+" "+filetype);
		boolean b;
		b=emptyfilename(filename);
		if(b==true)
			return false;
	    b=missingDot(filename);
	    if(b==true)
	    	return false;
	    return true;
	}
boolean emptyfilename(String filename){
	if (filename=="")
		return true;
	else
		return false;
}
boolean missingDot(String filename){
	Pattern costPattern =Pattern.compile("[.]");
	Matcher costMatcher =costPattern.matcher(filename);
	boolean value =costMatcher.find();
	if (value==true){
		return false;
	}
	else{
		return true;
	}
}
}
