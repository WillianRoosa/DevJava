package projeto.java.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked
        Object object = null;
        System.out.println(object.toString());  // Lança NullPointerException

        int[] nums = {1,2};
        System.out.println(nums[2]);    // Lança ArrayIndexOutOfBoundsException
    }
}