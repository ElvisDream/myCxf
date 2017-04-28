package org.company;

import com.wode.server.MyWebService;
import com.wode.server.impl.MyWebServiceImplService;

/**
 * Created by Elivs on 2017/4/24.
 */
public class test {
    public static void main(String[] args) {
        MyWebServiceImplService service = new MyWebServiceImplService();
        MyWebService myWebService = service.getMyWebServiceImplPort();
        System.out.println(myWebService.add(1, 2) +"-------client--------");
    }
}
