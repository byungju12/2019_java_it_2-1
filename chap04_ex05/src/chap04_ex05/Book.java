package chap04_ex05;

public class Book {
	String title;
	String author;

	void show() {
		System.out.println(title + " " + author);
	}

	public Book() {
		this("", "");
	}

	public Book(String title, String author) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("�����", "����");
		Book loveStory = new Book("����ģ��", "����");
		Book emptyBook = new Book();

		littlePrince.show();
		loveStory.show();

	}

}
