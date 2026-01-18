public class ImageEx
{
    public static void main(String[] args)
    {
        String[] images =
        {
            "cow.jpg", "kitten.jpg", "puppy.jpg", "pig.jpg", "reindeer.jpg"
        };

        ImageEx obj = new ImageEx();
        // Change index to see different images in the array!
        // Can you have it pick out a random image?
        int index = (int)(Math.random() * images.length);

        obj.printHTMLimage(images[index]);
    }

    // This method will just work in Active Code which interprets html
    public void printHTMLimage(String filename)
    {
        String baseURL =
                "https://raw.githubusercontent.com/bhoffman0/CSAwesome/master/_sources/Unit6-Arrays/6-1-images/";
        System.out.print("<img src=" + baseURL + filename + " width=500px />");
    }
}

 