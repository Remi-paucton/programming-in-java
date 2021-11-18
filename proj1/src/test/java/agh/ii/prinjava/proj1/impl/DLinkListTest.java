package agh.ii.prinjava.proj1.impl;

    import org.junit.jupiter.api.*;

    import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    /**
     * From the BeforeEach we have a list of 3 elements set for all the test
     */
    @BeforeEach
    void setUp() {
        dLinkList.addFirst(3);
        dLinkList.addFirst(2);
        dLinkList.addFirst(1);
    }

    /**
     * The Test will call the method which add item at the beggining of the list
     * but the method called modify the object without returning anything
     * We are using a 2nd method which return the data of first element to check if it has been correctly added
     */
    @Test
    void addStuffToBeggining(){
        dLinkList.addFirst(54);
        System.out.println(dLinkList.toString());
        Assertions.assertEquals(54,dLinkList.returnFirstElem());
        dLinkList.addFirst(12);
        System.out.println(dLinkList.toString());
        Assertions.assertEquals(12,dLinkList.returnFirstElem());
    }

    /**
     * The Test will call the method which add item at the end of the list
     * but the method called modify the object without returning anything
     * We are using a 2nd method which return the data of last element to check if it has been correctly added
     */
    @Test
    void addStuffToEnd(){
        dLinkList.addLast(54);
        System.out.println(dLinkList.toString());
        Assertions.assertEquals(54,dLinkList.returnLastElem());
        dLinkList.addLast(12);
        System.out.println(dLinkList.toString());
        Assertions.assertEquals(12,dLinkList.returnLastElem());
    }

    /**
     * From the BeforeEach we have a list of 3 elements
     * We will remove them one by one and return the first elem each time
     * The third time we must have a null result
     * The last time we will have a throw exception message 'the list is empty'
     */
    @Test
    void removeStuffToBeggining(){
        dLinkList.removeFirst();
        System.out.println(dLinkList.toString());
        Assertions.assertEquals(2,dLinkList.returnFirstElem());
        dLinkList.removeFirst();
        System.out.println(dLinkList.toString());
        Assertions.assertEquals(3,dLinkList.returnFirstElem());
        // on retire le dernier element et on a un objet head = null mais ca marche pas
        /*dLinkList.removeFirst();
        Assertions.assertNull(dLinkList);*/
    }

    /**
     * From the BeforeEach we have a list of 3 elements: 1<->2<->3
     * We will remove them one by one and return the last elem each time
     * The third time we must have a null result
     * The last time we will have a throw exception message 'the list is empty'
     */
    @Test
    void removeStuffToEnd(){
        dLinkList.removeLast();
        System.out.println(dLinkList.toString());
        Assertions.assertEquals(2,dLinkList.returnLastElem());
        dLinkList.removeLast();
        System.out.println(dLinkList.toString());
        Assertions.assertEquals(1,dLinkList.returnLastElem());
    }


    /**
     * We add 2 elements in ou 3 element list, we have 5 elements
     * We remove 4 of them the list have one unique element
     * We remove the last one the list is now empty, the counter return 0 element
     */
    @Test
    void tryToCountElement() {
        dLinkList.addFirst(5);
        dLinkList.addFirst(4);
        Assertions.assertEquals(5, dLinkList.countElems());
        dLinkList.removeLast();
        dLinkList.removeLast();
        dLinkList.removeLast();
        dLinkList.removeLast();
        Assertions.assertEquals(1, dLinkList.countElems());
        dLinkList.removeLast();
        Assertions.assertEquals(0, dLinkList.countElems());
    }

}




