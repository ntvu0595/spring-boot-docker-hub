//package vn.com.v1.springbootdockerhub;
//
//import io.camunda.zeebe.client.ZeebeClient;
//import io.camunda.zeebe.client.api.response.ProcessInstanceEvent;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import io.camunda.tasklist.dto.Task;
//import io.camunda.tasklist.dto.TaskList;
//import io.camunda.tasklist.dto.TaskSearch;
//import io.camunda.tasklist.dto.TaskState;
//
///*******************************************************************************
// * @Class           ：SampleController
// * @since           ：5/4/2023 10:43 AM
// * @Author          ：VuNT
// * @ChangeLog       ：5/4/2023 10:43 AM VuNT create a new
// * @version         : 1.0
// ******************************************************************************/
//@RestController
//public class SampleController {
//
//    @Autowired
//    ZeebeClient client;
//
//    @GetMapping
//    public String onBoard() {
//        final String bpmnProcessId = "Process_0qzbk5q";
//
//        System.out.println("Creating process instance");
//
//        final ProcessInstanceEvent processInstanceEvent =
//                client
//                        .newCreateInstanceCommand()
//                        .bpmnProcessId(bpmnProcessId)
//                        .latestVersion()
//                        .send()
//                        .join();
//        System.out.println(
//                "Process instance created with key: " + processInstanceEvent.getProcessInstanceKey());
////        client.newActivateJobsCommand().jobType("test");
//        TaskSearch ts = new TaskSearch().setProcessInstanceId(bpmnProcessId);
////        TaskList tasksFromInstance = client.get(ts);
//
//        return "Success";
//    }
//}
