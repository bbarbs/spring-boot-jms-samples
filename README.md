# Introduction
Sample jms synchronous and asynchronous implementation. Added also converter to convert message into json.

## Testing
Upon running the example you will see in the log the ff:
```
2018-03-02 18:51:23.877  INFO 3484 --- [           main] ication$$EnhancerBySpringCGLIB$$a469f799 : Sending Email
2018-03-02 18:51:23.962  INFO 3484 --- [enerContainer-1] com.example.demo.receiver.Receiver       : Email received: {"to":"test@gmail.com","body":"Test JMS"}
```
