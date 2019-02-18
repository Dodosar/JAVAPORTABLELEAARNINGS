package ModificatorToAcess;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;

            String output = "";
            //Add your code here
            if(getBook()  instanceof MarkTwainBook){
            	return output = markTwainOutput;
            }
            else if(getBook() instanceof AgathaChristieBook){
            	return output = agathaChristieOutput;
            }
            return output; 
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
    
    public static class MarkTwainBook extends Book{
        public MarkTwainBook(String title) {
        	super("Mark Twain");
        	this.title = title;
			// TODO Auto-generated constructor stub
		}

		private String title;

		@Override
		public MarkTwainBook getBook() {
			// TODO Auto-generated method stub
			return this;
		}

		public String getName(){
			return title;
		}
		

		@Override
		public String getTitle() {
			// TODO Auto-generated method stub
			return getName();
		}
        }
    

	public static class AgathaChristieBook extends Book{

		public AgathaChristieBook(String title){
			super("Agatha Christie");
			this.title = title;
		}
		
		private String title;

		@Override
		public AgathaChristieBook getBook() {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		public String getTitle() {
			// TODO Auto-generated method stub
			return  getName();
		}
		

		public String getName(){
			return title;
		}

	}
	
}
