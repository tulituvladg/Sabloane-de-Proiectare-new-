import java.util.ArrayList;

public class Table{
    String title;
    ArrayList<Table> tableArrayList=new ArrayList<>();

    public Table(String title)
    {
        this.title=title;
    }

    public String getTitle()
    {
        return title;
    }

    public void createNewTable(String text)
    {
        Table table=new Table(text);
        tableArrayList.add(table);
    }
}
