public class factorial{
    public static int clcfact(int n,int fact){
        fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            
        }
        return fact;
    }
    public static void main(String[] args){
        System.out.println(clcfact(5,1));
    }
}