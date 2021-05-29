import java.util.Random;

public class PasswordGenerator {
    int length;
    int strength;
    public static String generatePassword (int length,int strength){
        String UpperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LowerCase="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String SpecialChar="@#$!*()[]{}%";
        String CharCombine1=UpperCase+LowerCase;
        String CharCombine2=UpperCase+LowerCase+numbers;
        String CharCombine3=UpperCase+LowerCase+numbers+SpecialChar;
        String Password=null;

        Random rnd=new Random();
        char password[]=new char[length];

        if((length>=4) &&(length<=9)){
            if(strength==1){
                for(int i=0;i<length;i++){
                    password[i]=CharCombine1.charAt(rnd.nextInt(CharCombine1.length()));
                }
            }

            else if(strength==2){
                for(int i=0;i<length;i++){
                    password[i]=CharCombine2.charAt(rnd.nextInt(CharCombine2.length()));
                }
            }
            else if(strength==3){
                for(int i=0;i<length;i++){
                    password[i]=CharCombine3.charAt(rnd.nextInt(CharCombine3.length()));
                }
            }
            else{
                System.out.println("you have entered wrong length and strength");
            }

        }
        String str= new String(password);
        return str;
    }

    public static void main(String[] args) {
        PasswordGenerator ps=new PasswordGenerator();
         System.out.print(ps.generatePassword(7,3));//enter length from 4 to 9 and strength from 1 to 3
    }
}
