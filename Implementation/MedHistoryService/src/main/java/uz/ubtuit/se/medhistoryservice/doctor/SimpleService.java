/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uz.ubtuit.se.medhistoryservice.doctor;

import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author dilshod
 */
@Path("sample")
public class SimpleService {

@Path("greet")
@GET
public String doGreet() {
return "Hello Stranger, the time is "+ new Date();
}
}
