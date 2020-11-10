import java.util.ArrayList;

public class Paragraph
{
    String text;
    ArrayList<Paragraph> paragraphArrayList=new ArrayList<>();

    public Paragraph(String text)
    {
        this.text=text;
    }

    public String getText()
    {
        return this.text;
    }

    public void createNewParagraph(String text)
    {
        Paragraph paragraph=new Paragraph(text);
        paragraphArrayList.add(paragraph);
    }
}
