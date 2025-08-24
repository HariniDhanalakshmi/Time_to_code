package Training10;
public class Code2 {
        public static void main(String[] args){
            String str="hElLo";
            String res = "";
            for (int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(i%2!=0){
                    if(ch>='a'&&ch<=32){
                        ch=(char)(ch=32);
                    }
                }
                else {
                    if (ch>='A' && ch<='Z'){
                        ch=(char) (ch+32);
                    }
                }
                res = res+ch;

            }
            System.out.println(res);
        }

}


