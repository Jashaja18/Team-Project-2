/* Group #4, CS211, 3/1/21, Team Project #2
 * Jashanpreet, Thais, Shreya, Brandon, Doris, Ace
 * Client code to test project and its outputs
 */

public class ListClient {
	
    public static void main(String[] args) {
    	
    	// test ArrayList for addAll()
    	
    	// ArrayList testing
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        
        // add random numbers
    	testArray.add(5);
        testArray.add(76);
        testArray.add(-32);
        testArray.add(0);
        testArray.add(324);
        testArray.add(342);

        System.out.println("******ArrayList******");
        System.out.println(); // empty print statement to add a space between the outputs
        testList(testArray);
        
        // LinkedList testing
        LinkedList<Integer> testList = new LinkedList<Integer>();
        
        // add random numbers
    	testList.add(532);
        testList.add(8);
        testList.add(645);
        testList.add(-65);
        testList.add(3);
        testList.add(0);
        
        System.out.println("\n******LinkedList******");
        System.out.println();
        testList(testList);
    }
    
    // tests functionality of shared methods
    public static void testList(AbstractList<Integer> test) {
        
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
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        temp.add(1);
        temp.add(2);
        temp.add(3);
        test.addAll(temp);
        System.out.println("temp: " + temp);
        System.out.println("Test List (after addAll(temp)): " + test);
    }
}
