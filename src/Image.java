import java.util.ArrayList;

public class Image {
    String imageName;
    ArrayList<Image> imageArrayList=new ArrayList<>();

    public Image(String imageName)
    {
        this.imageName=imageName;
    }

    public String getImageName()
    {
        return this.imageName;
    }

    public void createNewImage(String imageName)
    {
        Image image=new Image(imageName);
        imageArrayList.add(image);
    }
}
