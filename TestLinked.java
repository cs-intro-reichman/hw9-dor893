public class TestLinked {
    public static void main (String[] args) {
        LinkedList list = new LinkedList();
        Node n = null;
        String expected = TesterMessagesEnum.ERROR + " NullPointerException!";
        String actual = "";
      
            list.remove(n);
            actual += list.getSize() == 0;
    


    }
    
}
