import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;

public class KeepMouseMove
{
    public static void main(String[] args)
    {
        try
        {
            final int sleep_ms = Integer.parseInt(args[0]);

            int cr = 1;
            while (true)
            {
                final Robot r = new Robot();

                final PointerInfo pi = MouseInfo.getPointerInfo();
                final Point p = pi.getLocation();

                final int x = (int) p.getX();
                final int y = (int) p.getY();
				
                r.mouseMove(x + cr, y + cr);
                cr = cr * -1;

                Thread.sleep(sleep_ms);
            }
        }
        catch (Exception e)
        {
            System.out.println("Usage: java KeepMouseMove [waitinig time ms]");

            e.printStackTrace();
        }
    }
}
