class Book{
 
    String name;
    String author;
    int year;
    public Publisher publisher;
 
    Book(String name, String author, int year, String publ){
         
        this.name = name;
        this.author = author;
        this.year = year;
        publisher = new Publisher(publ);
    }
     
    class Publisher{
     
        public String name;
        public Book book;
         
        public Publisher(String name){
            book=Book.this;
            this.name=name;
        }
    }
    public static void main(String args[]){    
    	Book b1 = new Book("Война и мир", "Л. Н. Толстой", 1863, "ХудКнига");
    	System.out.println(b1.publisher.name);}
}


