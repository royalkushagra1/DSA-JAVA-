package Array;

public class LinearSearch {
    static void main() {
        int [] arr= {12,23,44,67,4,8,9,77,-8};
        int target = -1;
        int found = -789;
        for(int i=0;i< arr.length;i++){
            if(arr[i] == target){
                found = i;
                break;

            }
        }
        if(found!=-789) System.out.println("Target exists in Array at index "+ found);
        else System.out.println("target missing in Array ");
    }
}
