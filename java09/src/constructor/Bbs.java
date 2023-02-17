package constructor;

public class Bbs {
	
	String title;
	String content;
	String writer;
	public Bbs(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "Bbs [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

	
	
	
}
