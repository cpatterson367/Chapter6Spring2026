

public class MagicSquare
{
    private int[][] a;
    public MagicSquare(int[][] array)
    {
        a = array;
    }
    
    public void setMagicSquare(int[][] array)
    {
        a = array;
    }

    public boolean isMagic()
    {
        

        int num = row_ttl(0);
        for (int i=0; i<a[0].length; i++)
        {
            if (row_ttl(i) != col_ttl(i) || row_ttl(i) != num)
                return false;
        }

        if (diag_ttl(0) != diag_ttl(1) || diag_ttl(0) != num)
            return false;

        return true;
    }

    public int getMagicNum()
    {
        return row_ttl(0);
    }

    public int row_ttl(int row)
    {
        int ttl = 0;
        for (int i=0; i<a.length; i++)
            ttl += a[row][i];
        return ttl;

    }

    public int col_ttl(int col)
    {
        int ttl = 0;
        for (int i=0; i<a[0].length; i++)
            ttl += a[i][col];
        return ttl;
    }

    public int diag_ttl(int type)
    {
        if (type == 0)
        {
            int ttl = 0;
            for (int i=0; i<a.length; i++)
                ttl += a[i][i];
            return ttl;
        }

        if (type == 1)
        {
            int ttl = 0;
            for (int i=0; i<a.length; i++)
                ttl += a[(a.length-1)-i][i];
            return ttl;
        }
        return 0;
    }
}