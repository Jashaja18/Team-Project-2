public class ListClient3 {
    public static void main(String[] args) {
    	
    	// ArrayList testing
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(5);
        testArray.add(76);
        testArray.add(-32);
        testArray.add(0);
        testArray.add(3244523);
        testArray.add(342);
        
        System.out.println("Test ArrayList (Initial State): " + testArray);
        System.out.println("Test ArrayList Size: " + testArray.size());
        System.out.println("Test Arraylist isEmpty: " + testArray.isEmpty());
        
        System.out.println();
        
        // LinkedList testing
        LinkedList<Integer> testList = new LinkedList<Integer>();
        testList.add(2);
        testList.add(234);
        testList.add(-43);
        testList.add(43243);
        testList.add(0);
        testList.add(43);
        
        System.out.println("Test LinkedList (Inital State): " + testList);
        System.out.println("Test LinkedList Size: " + testList.size());
        System.out.println("Test LinkedList isEmpty: " + testList.isEmpty());
    }

}
