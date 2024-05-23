public class maxmin {

    public static void rearrange(int arr[],
                                 int n)
    {
        // Initialize index of first minimum
        // and first maximum element
        int max_idx = n - 1, min_idx = 0;

        // Store maximum element of array
        int max_elem = arr[n - 1] + 1;

        // Traverse array elements
        for (int i = 0; i < n; i++)
        {
            System.out.println(i);
            // At even index : we have to put
            // maximum element
            if (i % 2 == 0)
            {
                System.out.println(arr[i]+"== ("+ arr[i]+" + "+arr[max_idx] +"%"+max_elem +") * " + max_elem);

                arr[i] += ((arr[max_idx] % max_elem) *
                        max_elem);
                System.out.println(arr[i]+"in"+ i);
                max_idx--;

            }

            // At odd index : we have to put
            // minimum element
else
            {
                System.out.println(arr[i]+"== ("+ arr[i]+" + "+arr[min_idx] +"%"+max_elem +") * " + max_elem);

                arr[i] += ((arr[min_idx] % max_elem) *
                        max_elem);
                System.out.println(arr[i]+"in"+ i);
                min_idx++;
            }
        }

        // Array elements back to it's
        // original form
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;
    }
    public static void main(String [] args)
    {
        int[] arr={1,2,3,4,5,6,7};
for(int a:arr)
        System.out.print(a);


        System.out.println("");

     rearrange(arr,arr.length);

        for(int a:arr)
        System.out.print(a);


    }
}
