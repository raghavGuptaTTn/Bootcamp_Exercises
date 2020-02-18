public class commonElements{

    public static void main(String args[]){
        int a[]= {1,2,3,4,5,6,7,8,6,10};
        int b[]= {2,4,6,4,10};

        // to count the frequency of elements in array.
        // basically i wish to use hashmap here but thats out of agenda.
        int freq[] = new int[100000];

        // count the frequenct of all elements from array 1
        for(int i=0; i<a.length; i++){
            freq[a[i]]++;
        }
        // if corresponding element is also present in array2, then print it.
        for(int j=0; j<b.length; j++){
            if(freq[b[j]] > 0){
                System.out.println(b[j]);
                freq[b[j]]--;
            }
        }
    }
}
