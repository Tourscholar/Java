public class Constants
{
    public static void main(String[] args)
    {
        final double CM_PER_INCH = 2.54;
        // final 指示常量,表示此变量只能被赋值一次
        double PaperWidth = 8.5;
        double PaperHeight = 11;
        System.out.println("Paper size in centimeters: "
            + PaperWidth * CM_PER_INCH + " by " + PaperHeight * CM_PER_INCH);
    }
}