package homework1;

public class FindMess {
    public static void main(String[] args) {
        String mess="姓名:张三 出生日期:1989.10.16。 个人网站:http://www.zhang.com。"+
                "身高:185 cm,体重:72kg";
        int index=mess.indexOf(":");
        String name=mess.substring(index+1);
        if(name.startsWith("张")){
            System.out.println("简历中的姓名张\"张\"");
        }
        index=mess.indexOf(":",2);
        String date=mess.substring(index+1,index+11);
        System.out.println(date);
        index=mess.indexOf(":",index+1);
        int heightPosition=mess.indexOf("身高");
        String personNet=mess.substring(index+1,heightPosition-1);
        System.out.println(personNet);
        index=mess.indexOf(":",heightPosition);
        int cmPosition=mess.indexOf("cm");
        String height=mess.substring(index+1,cmPosition);
        height=height.trim();
        int h=Integer.parseInt(height);
        if(h>=180){
            System.out.println("简历中的身高"+height+"大于或等于180 cm");
        }else{
            System.out.println("简历中的身高"+height+"小于180 cm");
        }
        index=mess.lastIndexOf(":");
        int kgPosition=mess.indexOf("kg");
        String weight=mess.substring(index+1,kgPosition);
        int w=Integer.parseInt(weight);
        if(w>=75){
            System.out.println("简历中的体重"+weight+"大于或等于75kg");
        }else{
            System.out.println("简历中的体重"+weight+"小于75kg");
        }

        //实验后的练习1
        String str1=new String("ABCDE");
        String str2=null;
        String str3=null;
        String str4=null;
        str2=str1.replaceAll("A","First");
        str3=str1.replaceAll("B","Second");
        str4=str1.replaceAll("C","Third");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        //实验后的练习2
        System.out.println("9的二进制是:"+toBinaryString(9));
        System.out.println("89的八进制是:"+toOctalString(89));
        System.out.println("79的十六进制是:"+toHexString(79));
        System.out.println("67的12进制是:"+toString(67,12));
    }
    public static String toBinaryString(long i){
        return Long.toBinaryString(i);
    }
    public static String toOctalString(long i){
        return Long.toOctalString(i);
    }
    public static String toHexString(long i){
        return Long.toHexString(i);
    }
    public static String toString(long i,int p){
        return Long.toString(i,p);
    }
}
