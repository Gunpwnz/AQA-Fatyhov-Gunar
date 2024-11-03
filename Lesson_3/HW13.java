package Lesson_3;

public class HW13 
{
    private static int height = 10;
    private static int width = 10;

    public static void main(String[] args) 
    {
        map(height, width);
    }

    private static void map(int height, int width) 
    {
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                if (x == y) 
                {
                    System.out.print("1");
                } 
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}