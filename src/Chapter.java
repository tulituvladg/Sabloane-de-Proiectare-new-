import java.util.ArrayList;

public class Chapter {
    ArrayList<SubChapter>subChapterArrayList=new ArrayList<SubChapter>();
    String name;

    public Chapter() {};
    public Chapter(String chapterName)
    {
        this.name=chapterName;
    }
    public int createSubChapter(String subChapterName)
    {
        SubChapter subChapter=new SubChapter(subChapterName);
        subChapterArrayList.add(subChapter);
        return subChapterArrayList.indexOf(subChapter);
    }
    public SubChapter getSubChapter(int subChapterIndex)
    {
        return subChapterArrayList.get(subChapterIndex);
    }


}
