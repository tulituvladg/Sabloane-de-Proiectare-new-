import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<Author> authorArrayList=new ArrayList<Author>();
    ArrayList<Chapter> chapterArrayList=new ArrayList<Chapter>();

    public Book(String bookName)
    {
        this.title=bookName;
    }

    public void addAuthor(Author author)
    {
        authorArrayList.add(author);
    }

    public int createChapter(String chapterName)
    {
        Chapter chapter=new Chapter(chapterName);
        chapterArrayList.add(chapter);
        return chapterArrayList.indexOf(chapter);
    }

    public Chapter getChapter(int chapterIndex)
    {
       return chapterArrayList.get(chapterIndex);
    }
}
