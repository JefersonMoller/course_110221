/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import enums.Order;
import enums.OrderStatus;
import java.util.Date;

/**
 *
 * @author j
 */
public class Course {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Order order = new Order(1080, new Date(), OrderStatus.valueOf("pending_payment"));
       
        System.out.println(order);
       
    }
    
}
