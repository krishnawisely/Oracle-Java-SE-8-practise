import java.util.Arrays;
class Main{
    
    public static void main(String[] args) {
        // ------String-------
        String str ="krishna";
        // System.out.println(str.substring(2,5)); // ish
        // System.out.print(str.substring(0,2));
        // -------StringBuilder inbuild function--------
        
        StringBuilder s = new StringBuilder();
        s.append("krishna");
        // s.replace(5,7, "hi"); // krishhi
        // s.insert(5, "ll"); // krishllna
        // s.delete(5,7); // krish
        // s.setLength(5); // krish
        // System.out.println(s.substring(0,2)); // kr
        // System.out.print(s);
        
        // -------Array-------
        
        int a[] = {2,3,1};
        // Ananymous array
        int b[] = new int[]{1,2,3,4,5};
        
        int c[] = {2,3,1};
        
        int i[][] = {{1,2,3}};
        int j[][] = {{1,2,3}};
        
        // Run time error -> NegativeArraySizeException
        // int c[] = new int[-2];
        
        // -------Array inbuild functions---------
        
        // Arrays.sort(a); // 123
        // Sort particular portion
        // Arrays.sort(a,1,3); // 213
        // Arrays.fill(a,5); // 555
        // System.out.print(Arrays.binarySearch(b,5)); // 4
        // System.out.print(Arrays.binarySearch(b,0,3,3)); // 2
        /* 
        Compare two arrays in lexicographically
        
        Compare first two character in the each array
        if a1 is grater than a2 then result is grater than 0
        if a1 is lesser than a2 then result is lesser than 0
        if both are match it will continue remaining charecters and if all are matched then return 0
        */
        // System.out.print(Arrays.compare(a,c)); // 0
        
        // single dimentional array
        // System.out.print(Arrays.equals(a,c));
        // Only for multidimentional array
        // System.out.print(Arrays.deepEquals(i,j));
        
        // Same reference will be there for i array
        // int i[] = a;
        // i[1] = 10;
        
        
        // for(int num: a)System.out.print(num);
        
        
        // System.out.print(20/012);
    }
}