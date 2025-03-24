package main;
import model.Comment;
import proxies.EmailCommentNotificationProxy;
import services.CommentService;
import repositories.DBCommentRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);

       /* var commentRepository =
                new DBCommentRepository();
        var commentNotificationProxy =
                new EmailCommentNotificationProxy();
        var commentService =
                new CommentService(
                        commentRepository, commentNotificationProxy);*/
        //The above is before DI and Spring. Note commentService

        var comment = new Comment();
        comment.setAuthor("Saghana Anthony");
        comment.setText("Demo comment");
        var commentService = context.getBean(CommentService.class);//New Addition.
        commentService.publishComment(comment);






    }



}