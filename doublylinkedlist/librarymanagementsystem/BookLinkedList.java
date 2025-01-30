package doublylinkedlist.librarymanagementsystem;

public class BookLinkedList {
        private BookNode head;
        private BookNode tail;
        public int count(){
            if(head==null)
                return 0;
            BookNode temp=head;
            int c=0;
            while(temp!=null){
                c++;
                temp=temp.getNext();
            }
            return c;
        }
        public void addAtBeginning(String title,String author,String genre,int id,boolean avlStatus){
            BookNode book=new BookNode(title,author,genre,id,avlStatus);
            if(head==null){
                tail=book;
            }
            if(head!=null)
                head.setPrev(book);
            book.setNext(head);
            head=book;
            System.out.println(title+" added at beginning.");
        }
        public void addAtEnd(String title,String author,String genre,int id,boolean avlStatus){
            BookNode book=new BookNode(title,author,genre,id,avlStatus);
            if(head==null){
                head=book;
                tail=book;
                return;
            }
            tail.setNext(book);
            book.setPrev(tail);
            tail=book;
        }
        public void addAtPosition(String title,String author,String genre,int id,boolean avlStatus,int position){
            int count=count();
            if(position<=0||position>count+1){
                System.out.println("Invalide position!");
                return;
            }
            if(position==1){
                addAtBeginning(title,author,genre,id,avlStatus);
                return;
            }
            if(position==count+1){
                addAtEnd(title,author,genre,id,avlStatus);
                return;
            }
            BookNode book=new BookNode(title,author,genre,id,avlStatus);
            int pos=1;
            BookNode temp=head;
            BookNode prev=null;
            while(pos<position){
                pos++;
                temp=temp.getNext();
            }

            book.setNext(temp);
            book.setPrev(temp.getPrev());
            temp.getPrev().setNext(book);
            temp.setPrev(book);
        }

        public void removeBookById(int id){
            if(head==null){
                System.out.println("Book List is empty!");
                return;
            }
            if(head.getId()==id){
                if(head.getNext()==null){
                    head=null;
                    tail=null;
                    return;
                }
                head=head.getNext();
                head.setPrev(null);
                return;
            }
            if(tail.getId()==id){
                tail.getNext().setPrev(null);
                tail=tail.getNext();
                return;
            }
            BookNode temp=head;
            while(temp!=null&&temp.getId()!=id){
                temp=temp.getNext();
            }
            if(temp==null){
                System.out.println("Book with id "+id+" is not present.");
                return;
            }
            else{
                temp.getNext().setPrev(temp.getPrev());
                temp.getPrev().setNext(temp.getNext());
            }
        }
        public void searchBookByTitle(String title){
            if(head==null){
                System.out.println("Book list is empty.");
                return;
            }
            BookNode temp=head;
            while(temp!=null&&!temp.getBookTitle().equals(title)){
                temp=temp.getNext();
            }
            if(temp==null){
                System.out.println(title+" is not present in list.");
                return;
            }
            else{
                System.out.println("Book "+title+" found...");
                System.out.println(temp);
            }
        }
    public void searchBookByAuthor(String author){
        if(head==null){
            System.out.println("Book list is empty.");
            return;
        }
        BookNode temp=head;
        while(temp!=null&&!temp.getAuthor().equals(author)){
            temp=temp.getNext();
        }
        if(temp==null){
            System.out.println(author+"'s books are not present in list.");
            return;
        }
        else{
            System.out.println(author+"'s book found...");
            System.out.println(temp);
        }
    }
    public void updateAvailabilityStatus(int id,boolean status){
            if(head==null){
                System.out.println("Book list is empty!");
                return;
            }
            BookNode temp=head;
            while(temp!=null&&temp.getId()!=id){
                temp=temp.getNext();
            }
            if(temp==null){
                System.out.println("Book with id "+id+" is not present in list.");
                return;
            }
            else{
                temp.setAvailabilityStatus(status);
            }
    }
    public void displayForward(){
            if(head==null){
                System.out.println("Book list is empty!");
                return;
            }
            BookNode temp=head;
            while (temp!=null){
                System.out.println(temp);
                System.out.println("==================");
                temp=temp.getNext();
            }
    }
    public void displayBackward(){
            if(head==null){
                System.out.println("Book list is empty!");
                return;
            }
            BookNode temp=tail;
            while(temp!=null){
                System.out.println(temp);
                System.out.println("===================");
                temp=temp.getPrev();
            }
    }


}
