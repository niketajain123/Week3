package circularlinkedlist.ticketreservationsystem;

public class TicketLinkedList {
    private TicketNode head;
    public void addAtEnd(int id,String cName,String mName,int seatNo,String bookingtime){
        TicketNode ticket=new TicketNode(id,cName,mName,seatNo,bookingtime);
        if(head==null){
            head=ticket;
            ticket.setNext(head);
            return;
        }
        TicketNode temp=head;
        do{
            temp=temp.getNext();
        }while (temp.getNext()!=head);
        temp.setNext(ticket);
        ticket.setNext(head);
    }
    public void removeById(int id){
        if(head==null){
            System.out.println("Ticket list is empty!");
            return;
        }
        if(head.getTicketId()==id){
            if(head.getNext()==head){
                head=null;
                return;
            }
            TicketNode p=head;
            while (p.getNext()!=head){
                p=p.getNext();
            }
            p.setNext(head.getNext());
            head=head.getNext();
            return;
        }
        TicketNode prev=null;
        TicketNode temp=head;
        do{
            prev=temp;
            temp=temp.getNext();
        }while (temp!=head&&temp.getTicketId()!=id);
        if(temp==head){
            System.out.println("No ticket with id "+id+" is present.");
        }
        else{
            prev.setNext(temp.getNext());

        }
    }
    public void display(){
        if(head==null){
            System.out.println("Ticket list is empty!");
            return;
        }
        TicketNode temp=head;
        do{
            System.out.println(temp);
            System.out.println("============================================================================================");
            temp=temp.getNext();
        }while (temp!=head);
    }
    public void searchTicketByMovieName(String movieName){
        if(head==null){
            System.out.println("Ticket Lit is empty!");
            return;
        }
        TicketNode temp=head;
        do{
            if(temp.getMovieName().equals(movieName))
                break;
            temp=temp.getNext();
        }while (temp!=head);
        if(temp==head&&!temp.getMovieName().equals(movieName)){
            System.out.println("No ticket is booked for "+movieName);
        }
        else{
            System.out.println("Movie found...");
            System.out.println(temp);
        }
    }
    public void searchTicketByCustomerName(String customerName){
        if(head==null){
            System.out.println("Ticket Lit is empty!");
            return;
        }
        TicketNode temp=head;
        do{
            if(temp.getCustomerName().equals(customerName))
                break;
            temp=temp.getNext();
        }while (temp!=head);
        if(temp==head&&!temp.getCustomerName().equals(customerName)){
            System.out.println("No ticket is booked by "+customerName);
        }
        else{
            System.out.println("Movie found...");
            System.out.println(temp);
        }
    }
    public int totalTickets(){
        if(head==null){
            return 0;
        }
        int count=0;
        TicketNode temp=head;
        do{
            count++;
            temp=temp.getNext();
        }while (temp!=head);
        return count;
    }

}
