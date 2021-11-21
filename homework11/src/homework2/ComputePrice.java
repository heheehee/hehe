package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputePrice {
    public static void main(String[] args) {
        String menu="北京烤鸭:189 元 西芹炒肉:12.9 元 酸菜鱼:69 元 铁板牛肉:32 元";
        Scanner scanner=new Scanner(menu);
        String regex="[^123456789.]+";
        scanner.useDelimiter(regex);
        double sum=0;
        while(scanner.hasNext()){
            try{
                double price=scanner.nextDouble();
                sum=sum+price;
                System.out.println(price);
            }catch(InputMismatchException exp){
                String t=scanner.next();
            }
        }
        System.out.println("菜单总价格:"+sum+"元");

        //实验后的练习
        String address="中央电视台:www.cctv.com 清华大学:www.tsinghua.edu.cn";
        String regex2="[^(http//|www)\56?\\w+\56{l}\\w+\56{l}\\p{Alpha}]+";
        Scanner scanner2=new Scanner(address);
        scanner2.useDelimiter(regex2);
        while(scanner2.hasNext()){
            try{
                String add= scanner2.next();
                System.out.println(add);
            }catch(InputMismatchException exp){
                String t=scanner.next();
            }
        }
    }

}
