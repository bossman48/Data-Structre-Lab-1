public class DLLDriver {
	public static void main(String[] args) {
		DoublyLinkedList<Person> list = new DoublyLinkedList<>();
        DoublyLinkedList<Person> hardCopy;
        DoublyLinkedList<Person> hardCopy2;

        Person p1=new Person("osman",10);

        list.addFirst(p1);
        try{
            hardCopy=list.clone2();
            hardCopy2=list.clone();
            list.first().setName("riza");
            System.out.println(hardCopy2.toString());
            System.out.println(hardCopy.toString());
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
			

			System.out.println(list.toString());
			
	}
}
