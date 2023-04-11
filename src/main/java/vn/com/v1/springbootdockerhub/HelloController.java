package vn.com.v1.springbootdockerhub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*******************************************************************************
 * @Class           ：HelloController
 * @since           ：4/4/2023 3:05 PM
 * @Author          ：Zephyrus-PC
 * @ChangeLog       ：4/4/2023 3:05 PM Zephyrus-PC create a new
 * @version         : 1.0
 ******************************************************************************/
@RestController
@RequestMapping("/rest")
public class HelloController {
    /**
     * This is about <code>HelloController.java</code>.
     * @author VuNT
     * @since 4/5/2023 5:03 PM
     * @description use <code></code>
     * @return 
     * <code></code>
     */
    @GetMapping("/get")
    public String hello() {
        System.out.print("LMA");
        return "Helaos";
    }

}
