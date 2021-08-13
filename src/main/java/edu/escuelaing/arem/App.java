package edu.escuelaing.arem;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void  main(String[] args )
    {
        System.out.println( "Starting!" );
        get("/hello", (req, res) -> "Hello World");
    }
}
