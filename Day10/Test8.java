public class Test8 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8};

        int [] copyArr = copyOfRange(arr,3,7);

        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr,int from,int to){

         int [] newArr = new int[to - from];

         int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
