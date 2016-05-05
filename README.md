Testing for the life cycle about activity, application and broadcast receiver.

#### important:

In most third party android rom, when the process of the applicaiton has been killed, the broadcast receiver will never receive the broadcast.

But in Nexus, the broadcast receiver can still get the broadcase and wake up the application.

在绝大部分的第三方ROM中，当应用进程被杀死，静态注册的receiver将无法收到广播消息，但是在原生的ROM中，receiver将依然会收到广播消息，并且在onRecieve之前会调用Application.onCreate。

