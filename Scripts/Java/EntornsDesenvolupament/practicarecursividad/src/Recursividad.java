public class Recursividad {

    //Fibonacci
    public int fibonacci(int n){
        if (n==0) return 0;
        else if(n==1) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    //SUmar un array
    public int Array(int[] arr,int a ){
        if (a <0)return 0;
        else return arr[a]+ Array(arr, a-1);
    }
    //Invertir un string
    public String Invertir(String s){
        if (s.length()==1)return s;
        else return Invertir(s.substring(1))+s.charAt(0);
    }
    //Torres de Hanoi
    public void Hanoi(int n, char origen, char destino, char auxiliar){
        if (n == 1){
            System.out.println("Se mueve el disco de torre "+origen+" a "+destino);
            return;
        }else{
            Hanoi(n-1, origen, auxiliar, destino);
            System.out.println("Se mueve el disco de torre "+origen+" a " +destino);
            Hanoi(n-1,auxiliar, origen, destino);
        }

    }
    public static void main(String[] args) throws Exception {
        int[] array = {1,2,3,4,5};
        String java = "Java";
        Recursividad r = new Recursividad();
        System.out.println(r.fibonacci(7));
        System.out.println(r.Array(array, array.length-1));
        System.out.println(r.Invertir(java));
        r.Hanoi(3, 'A', 'B', 'C');

    }
}
