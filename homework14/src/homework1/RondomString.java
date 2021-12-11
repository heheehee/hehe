package homework1;

public class RondomString {
    String str="";
    public String getRandomString(String s){
        StringBuffer stringBuffer=new StringBuffer(s);
        int m=stringBuffer.length();
        for(int k=0;k<m;k++){
            int index=(int)(Math.random()*stringBuffer.length());
            char c=stringBuffer.charAt(index);
            str=str+c;
            stringBuffer=stringBuffer.deleteCharAt(index);
        }
        return str;
    }
}
