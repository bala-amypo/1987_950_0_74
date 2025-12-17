import org.springframework.web.bind.
@RestController
public class basics{
    @GetMappping("/home")
    public String name(){
        return "hello world";
    }
}