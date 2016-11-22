public class Main {

    public static void main(String[] args) {

        //1
        for (int i = 15; i <= 25; i++) {
            System.out.println(i);
        }
        //2
        int [] arr2 = new int[10];
        for (int a = 33; a >= 15; a--){
            if (a%2 !=0) {
                System.out.println(a);
            }

        }

        //3
        String [] arr3 = {};
        for (int q = 0; q<arr3.length; q++) {
            System.out.print(arr3[q] +",");
        }
        //4
        int [] ar1 = {};
        for (int w = ar1.length-1; w>=0; w--){
            System.out.println(ar1[w]);
        }
        //5
        int k = 5;
        int [] ar2 = new int [20];
        for ( int e = 0   ; e < ar2.length; e++) {
            ar2[0]=k;
            System.out.println(ar2[0]);
            k=k+3;
        }
        //6
        int a1 = 4;
        int [] ar3 = new int [10];
        for (int a = 0; a<ar3.length; a++){
            ar3[a]=a1;
            System.out.println(ar3[a]);
            a1=2*a1-1;
        }
        //7
        int [] ar4 = {};
        int sum = 0;
        for(int i =0; i<ar4.length;i++){
            sum = sum + ar4[i];
            int a = (sum >=0)? sum : 0;
            System.out.println("sum >= 0 =" + a );
        }
        //8
        int [] ar5 = {1,5,4,7,8};
        int max = ar5[0];
        int min = ar5[0];
        for (int i = 0; i<ar5.length;i++){
            int a = (max >ar5[i])? max : max;
            int b = (min <ar5[i])? min : min;
            int c = (a > b)? a-b: a-b;
            System.out.println("max =" +a);
            System.out.println("min =" +b);
            System.out.println("a-b =" +c);

        }
        System.out.println(max);
        System.out.println(min);


    }
}






