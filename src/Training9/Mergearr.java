class Code1{
    public static void main(String[] args){
        String str="abc@123# hi";
        int vowel_count=0;
        int consonant_count=0;
        int num_count=0;
        int spl_count=0;
        for (char i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if ((ch>='A' && ch<='Z') || (ch>='a' &&ch<='z')){
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vowel_count++;
                }
                else{
                    consonant_count++;
                }
            }
            else if(ch>='0' && ch<='9'){
                num_count++;
            }
            else if(ch=='!' ||ch=='@'|| ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' || ch=='(' || ch==')' || ch=='-' || ch=='_' || ch=='+' || ch=='=' || ch=='{' || ch=='}' || ch=='[' || ch==']' || ch==':' || ch==';' || ch=='"' || ch=='\'' || ch=='<' || ch=='>' || ch==',' || ch=='.' || ch=='?' || ch=='/' ){
                spl_count++;
            }
        }
        System.out.println("Vowel count:"+vowel_count);
        System.out.println("Consonant count:"+consonant_count);
        System.out.println("Number count:"+num_count);
        System.out.println("Special Symbol count:"+spl_count);
    }
}