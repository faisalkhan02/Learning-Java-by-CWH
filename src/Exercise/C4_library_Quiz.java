
    class Library{
        String[] books;
        int no_of_books;

        Library(){
            this.books = new String[100];
            this.no_of_books = 0;
        }
        void addBook(String book){
            this.books[no_of_books] = book;
            no_of_books++;
            System.out.println(book + " has been added!");
        }
        void showAvailableBooks(){
            System.out.println("Available Books are:");
            for (String book : this.books){
                if(book == null){
                    continue;
                }
                System.out.println("* "+book);
            }
        }
        void issueBook(String book){
            for (int i=0;i<this.books.length;i++){
                if(this.books[i].equals(book)){
                    System.out.println("This book has been issued!");
                    this.books[i] = null;
                    return;
                }
            }
            System.out.println("This book does not exist");
        }

        void returnBook(String book){
            addBook(book);
        }
    }
public class C4_library_Quiz {
    public static void main(String[] args) {
        Library cl = new Library();
        cl.addBook("Think and grow rich");
        cl.addBook("Algorithm");
        cl.addBook("C++");
       
        cl.showAvailableBooks();

        cl.issueBook("C++");
        cl.showAvailableBooks();
    }
}
