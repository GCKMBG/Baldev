
import java.lang.*;
import java.util.*;

class Q{
    static void q1(){
        int count=0,count1=0,count2=0;
        System.out.println("please enter your no");
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();     
        
        int arrc[]=new int[n];
        String[]s=new String[arrc.length];
        for( int i=1;i<=n;i++){
           
            arrc[i-1]=i; 
         }             

     for( int i=0;i<arrc.length;i++){
           
        s[i]=String.valueOf(arrc[i]); 
     }
for(String j:s){
if(((j.length())%2)!=0){
          count+=j.length()*2;

}
else{
if(((j.length())%4)!=0){
count1+=j.length()*3;

}else{
count2+=j.length()*4;
}
} 
}
int x=count+count1+count2;

int a=0,b=0;
while(true){
a+=x%10;
x=x/10;
if(x==0){
        if(a>=10){
            x=a;
            a=0;
            continue;
        }
        else{ System.out.println("your answer is= "+a);
    break;  }

} 
}
      }

      static void q2(){
        System.out.println("please enter your string where you want to remove white space");
        Scanner sc = new Scanner(System.in);

                String a=sc.nextLine(); 
    for(int i =0;i<a.length();i++){ 
      if(a.charAt(i)==' '){
          System.out.print("");
      }
      else{
          System.out.print(a.charAt(i));
      }
    }   
         } 

         static void q3(){
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter your number of ticket = ");
            int a=sc.nextInt();

            
            int count=0,count1=0,count2=0;
           int b[]=new int[a];
            for(int i=0;i<b.length;i++){
                System.out.println("please enter age of indisual person= ");
                 b[i]=sc.nextInt();

            }
for(int j:b){
if(j<3){
count++;
}
else if(j>2&&j<12){
count1+=100;

}
else{
count2+=150;
}
}

int total = count1+count2;
System.out.println("your totel bil is = "+total+ "rs" +"\n"+"your "+count+" child free to enjoy movies"+"\n");

          }    
}

class Test{
    public static void main(String[] args) {
       Q obj=new Q();
       while(true){
        System.out.println("To seen answer of que. no.1 press 1"+"\n"+"To seen answer of que. no.2 press 2"+"\n"+"To seen answer of que. no.3 press 3");
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        if(i==1){ obj.q1();}
        else if(i==2){ obj.q2();}
       else{obj.q3();}    
    
       }
        
    }
}