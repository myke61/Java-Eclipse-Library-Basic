public class Books {
	
	public String name;
	public String author;
	public String publisher;
	public double prize;
	
	public Books(String name,String author,String publisher,double prize)
	{
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.prize=prize;
	}
	public void ShowBooks()
	{
		System.out.println("Name of book:"+name);
		System.out.println("Author of book:"+author);
		System.out.println("Publisher of book:"+publisher);
		System.out.println("Prize of book:"+prize+"$");
		System.out.println("-------------------------");
	}
	
}
