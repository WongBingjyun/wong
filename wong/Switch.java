package wong;


import java.util.Scanner;

public class Switch {
    static class setGet1{
        private int size;
        public int getSize(){
            return size;
        }
        public void setSize(int s){
            size = s;
        }
    }
    static class setGet2{
        private String size;
        public String getSize(){
            return size;
        }
        public void setSize(String s){
            size = s;
        }
    }
        public static void main(String args[]) {
            System.out.println("请选择加密/解密规则: 1.凯撒加密(解密) 2.MD5加密");
            Scanner a=new Scanner(System.in);
            setGet1 one = new setGet1();
            one.setSize(a.nextInt());
            setGet1 two = new setGet1();
            setGet2 three = new setGet2();
            switch (one.getSize()){
                case 1://凯撒加密
                    System.out.println("请输入你所要使用的功能：1.加密 2.解密");
                    Scanner t=new Scanner(System.in);
                    two.setSize(t.nextInt());
                    CaesarEncryption kaiSa=new CaesarEncryption();
                    switch(two.getSize()) {
                        case 1://加密
                            System.out.println("请输入明文:");
                            Scanner s1 = new Scanner(System.in);
                            three.setSize(s1.nextLine());
                            String text = three.getSize();
                            System.out.println("请输入偏移量:");
                            Scanner s2 = new Scanner(System.in);
                            int key1 = s2.nextInt();
                            kaiSa.jiaMi(key1,text);
                            break;
                        case 2://解密
                            System.out.println("请输入密文");
                            Scanner s3 = new Scanner(System.in);
                            three.setSize(s3.nextLine());
                            String code = three.getSize();
                            System.out.println("请输入偏移量");
                            Scanner s4 = new Scanner(System.in);
                            int key2 = s4.nextInt();
                            kaiSa.jieMi(key2,code);
                            break;
                    }
                    break;
                case 2://MD5加密
                    System.out.println("请输入你所要使用的功能：1.加密 2.解密");
                    Scanner s5=new Scanner(System.in);
                    two.setSize(s5.nextInt());
                    Md5Encryption md5 = new Md5Encryption();
                    switch(two.getSize()) {
                                case 1://加密
                                    System.out.println("请输入明文:");
                                    Scanner s1 = new Scanner(System.in);
                                    three.setSize(s1.nextLine());
                                    String c = three.getSize();
                                    md5.jiaMia(c);
                                    break;
                                case 2:
                                    md5.jieMia();
                    }
            }
        }
    }


