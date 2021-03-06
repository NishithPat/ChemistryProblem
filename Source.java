public class Source {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int a = 10;
        changearr(arr, a);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }    
        System.out.println(a);
    }
    public static void changearr(int[] arr, int a) {    //non-primitive data types are passed by reference(in a vague sense)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        a = 5;                          //primitive data types are passed by value
    }
}
