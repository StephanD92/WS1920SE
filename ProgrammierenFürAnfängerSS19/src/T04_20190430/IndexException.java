package T04_20190430;

public class IndexException extends Exception
{
  public IndexException(String msg)
  {
    super(msg);
  }

  public IndexException()
  {
    super();
  }

  public IndexException(int min, int max)
  {
    super("Der Index liegt nicht zwischen " + min + " und " + max);
  }
}
