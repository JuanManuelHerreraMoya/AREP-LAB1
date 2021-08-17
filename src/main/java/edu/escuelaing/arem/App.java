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
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroku");
    }
    static int getPort(){
        if (System.getenv("PORT")!= null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;// return default port if heroku-port ins't set (on local host)
    }
}
