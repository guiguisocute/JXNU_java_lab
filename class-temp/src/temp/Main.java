package temp;

public class Main {
    public static void main(String[] args) {
        int[] b = {1,2,3,4,5,6};
        S_L a = new S_L(6,b);
        System.out.println(a);
        int [] c = {5,6,7,8};
        a.append(c);
        System.out.println(a);

    }
}

class S_L{
    int[] arr;
    int len;

    S_L(int size,int[] in){
        arr = new int[size];
        len = in.length;
        System.arraycopy(in, 0, arr, 0, len);
    }

    @Override
    public String toString(){
        String res = "";
        int j = 0;
        for(int i : arr){
            if(j < len){
            res += i + " ";
            j++;
            }
            

        }
        return res;
    }

    void append(int[] add){
        int newlength = arr.length;
        while(arr.length + add.length > newlength){
            newlength = (int)(newlength * 1.5);
        }

        int[] b = new int[newlength];
        System.arraycopy(arr, 0,b,0 ,len);
        for(int i : add){
            b[len] = i;
            len++;
        }
        arr = b;
    }


}