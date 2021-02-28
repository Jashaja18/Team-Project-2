
public class ListClient3 {
    public static void main(String[] args) {
    	
    	// ArrayList testing
        ArrayList<Integer> testArray = new ArrayList<Integer>();

        System.out.println("*Arraylist");
        testList(testArray);
        
        // LinkedList testing
        LinkedList<Integer> testList = new LinkedList<Integer>();
        
        System.out.println("*LinkedList");
        testList(testList);
    }
    
    // tests functionality of shared methods
    public static void testList(AbstractList<Integer> test) {
    	
    	// add random numbers
    	test.add(5);
        test.add(76);
        test.add(-32);
        test.add(0);
        test.add(3244523);
        test.add(342);
        
    	System.out.println("Test List (Initial State): " + test);
        System.out.println("size() test: " + test.size());
        System.out.println("isEmpty test: " + test.isEmpty());
        System.out.println("get(4) test: " + test.get(4));
        
        test.remove(4);
        System.out.println("Test List (after remove(4): " + test);
        
        test.add(3, 69);
        System.out.println("Test List (after add(3, 69): " + test);
        
        test.clear();
        System.out.println("Test List (after clear()): " + test);
        System.out.println();
    }

}
