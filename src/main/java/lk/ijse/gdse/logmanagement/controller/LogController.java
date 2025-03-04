package lk.ijse.gdse.logmanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Prabodha Thathsarani
 * @date 2/27/25
 * @project log-management
 **/

@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public String logMessage(){
        String message = "Hello";

        logger.debug("this is DEBUG log message", message);
        logger.info("this is INFO log message");
        logger.warn("this is WARN log message");
        logger.error("this is ERROR log message");

        try{
           throw new RuntimeException("Hello i'm exception");
        }catch(Exception e){
            logger.error("this is error : {}", e.getMessage());
        }

        return "log messege generated ! ";
    }
}
