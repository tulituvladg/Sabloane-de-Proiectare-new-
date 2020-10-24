import java.util.ArrayList;

public class SubChapter {
    String name;
    ArrayList<Image> imageArrayList= new ArrayList<>();
    ArrayList<Table> tableArrayList=new ArrayList<>();
    ArrayList<Paragraph> paragraphArrayList=new ArrayList<>();
    public SubChapter(String subChapterName)
    {
        this.name=subChapterName;
    }

    public void createNewParagraph(String text)
    {
        Paragraph paragraph=new Paragraph(text);
        paragraphArrayList.add(paragraph);
        //paragraph.createNewParagraph(text);
    }

    public void createNewImage(String imageName)
    {
        Image image=new Image(imageName);
        imageArrayList.add(image);
        //image.createNewImage(imageName);
    }

    public void createNewTable(String title)
    {
        Table table=new Table(title);
        tableArrayList.add(table);
        //table.createNewTable(title);
    }

    public void print()
    {
        byte index=0;

        for(;index<paragraphArrayList.size();++index)
        {
            System.out.println("Paragraph: "+ paragraphArrayList.get(index).getText());
        }

        index=0;

        for(;index<imageArrayList.size();++index)
        {
            System.out.println("Image with name:"+ imageArrayList.get(index).getImageName());
        }

        index=0;

        for(;index<tableArrayList.size();++index)
        {
            System.out.println("Table with Title:"+ tableArrayList.get(index).getTitle());
        }
    }



}
