package doublylinkedlist.moviemanagementsystem;

public class MovieLinkedList {
    private MovieNode head;
    private MovieNode tail;
    private int count(){
        int c=0;
        MovieNode temp=head;
        while (temp!=null){
            c++;
            temp=temp.getNext();
        }
        return c;
    }
    public void addAtBeginning(String movieName,String director,int yor,double rating){
        MovieNode movie=new MovieNode(movieName,director,yor,rating);
        movie.setNext(head);
        if(head==null){
            tail=movie;
        }
        if(head!=null){
            head.setPrev(movie);
        }
        head=movie;
        System.out.println(movieName+" added at beginning!");
    }
    public void addAtEnd(String movieName,String director,int yor,double rating){
        MovieNode movie=new MovieNode(movieName,director,yor,rating);
        if(head==null){
            head=movie;
            return;
        }
        MovieNode temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        movie.setPrev(temp);
        temp.setNext(movie);
        tail=movie;
    }
    public void addAtPosition(String movieName,String director,int yor,double rating,int position){

        if(position<=0||position>count()+1){
            System.out.println("Invalid position!");
            return;
        }
        MovieNode movie=new MovieNode(movieName,director,yor,rating);
        if(position==1) {
            addAtBeginning(movieName, director, yor, rating);
            return;
        }
        if(position==count()+1){
            addAtEnd(movieName,director,yor,rating);
            return;
        }
        MovieNode temp=head;
        MovieNode prev=null;
        int pos=1;
        while(pos<position){
            pos++;
            prev=temp;
            temp=temp.getNext();
        }
        prev.setNext(movie);
        movie.setPrev(prev);
        movie.setNext(temp);
        if(temp!=null)
        temp.setPrev(movie);
    }
    public void removeMovieByTitle(String title){
        if(head==null){
            System.out.println("Movie list is empty!");
            return;
        }
        if(head.getMovieTitle().equals(title)){
            if(head.getNext()==null) {
                head = null;
                tail=null;
                return;
            }
            head=head.getNext();
            head.setPrev(null);
            return;
        }
        MovieNode temp=head;
        MovieNode prev=null;
        while(temp!=null&&!temp.getMovieTitle().equals(title)){
            prev=temp;
            temp=temp.getNext();
        }
        if(temp==null){
            System.out.println(title+ " is not present in the list!");
        }
        else {
            prev.setNext(temp.getNext());
            if (temp.getNext() != null) {
                temp.getNext().setPrev(prev);
            }
            if(temp.getNext()==null)
                tail=temp.getPrev();
        }
    }
    public void searchMovieByDirector(String director){
        if(head==null){
            System.out.println("Movie list is empty!");
            return;
        }
        MovieNode temp=head;
        while (temp!=null&&!temp.getDirector().equals(director)){
            temp=temp.getNext();
        }
        if(temp==null){
            System.out.println(director+"'s movie is not present in the list.");
        }
        else{
            System.out.println(temp.toString());
        }
    }
    public void searchMovieByRating(double rating){
        if(head==null){
            System.out.println("Movie list is empty!");
            return;
        }
        MovieNode temp=head;
        while (temp!=null&&temp.getRating()!=rating){
            temp=temp.getNext();
        }
        if(temp==null){
            System.out.println("Movie with rating "+rating+" is not present in the list.");
        }
        else{
            System.out.println(temp.toString());
        }
    }
    public void displayForward(){
        if(head==null){
            System.out.println("Movie list is empty!");
            return;
        }
        MovieNode temp=head;
        while(temp!=null){
            System.out.println(temp);
            System.out.println("=====================");
            temp=temp.getNext();
        }
    }
    public void displayBackward(){
        if(tail==null){
            System.out.println("Movie list is empty!");
            return;
        }
        MovieNode temp=tail;
        while(temp!=null){
            System.out.println(temp);
            System.out.println("=======================");
            temp=temp.getPrev();
        }
    }
    public void updateRatingByTitle(String title,double rating){
        if(head==null){
            System.out.println("Movie list is empty!");
            return;
        }
        MovieNode temp=head;
        while(temp!=null&&!temp.getMovieTitle().equals(title)){
            temp=temp.getNext();
        }
        if(temp==null){
            System.out.println("Movie "+title+" is not present.");
        }
        else{
            temp.setRating(rating);
        }
    }

}
