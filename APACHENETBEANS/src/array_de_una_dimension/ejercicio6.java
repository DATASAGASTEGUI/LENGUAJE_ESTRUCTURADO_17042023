package array_de_una_dimension;
public class ejercicio6 {
    public static void main(String[] args) {
        int[] num=new int [15];
        int tmp=0;
        for(int i=0;i<num.length;i++){
            num[i] = (int) (Math.random() * 100+1);
            System.out.print("("+num[i]+"),");
        }
        tmp=num[num.length-1];
        for (int i=num.length-1;i>1;i--){
            num[i]=num[i-1];
        }
        System.out.println();
        System.out.println();
        System.out.println();
        num[0]=tmp;
        for(int i=0;i<num.length;i++){
            System.out.print("("+num[i]+"),");
        }
    }
    
}
