package vn.com.v1.springbootdockerhub;

import org.springframework.stereotype.Service;

/*******************************************************************************
 * @Class           ：ServiceCredit
 * @since           ：5/6/2023 4:09 PM
 * @Author          ：VuNT
 * @ChangeLog       ：5/6/2023 4:09 PM VuNT create a new
 * @version         : 1.0
 ******************************************************************************/

@Service
public class ServiceCredit implements ServiceInterface {

    @Override
    public void getServiceCredit() {
        System.out.println("service credit is available");
    }

}
