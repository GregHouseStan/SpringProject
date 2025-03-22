package main;
import model.Comment;
import proxies.EmailCommentNotificationProxy;
import services.CommentService;
import repositories.DBCommentRepository;
public class Main {
    public static void main(String[] args) {


        var commentRepository =
                new DBCommentRepository();
        var commentNotificationProxy =
                new EmailCommentNotificationProxy();

        var commentService =
                new CommentService(
                        commentRepository, commentNotificationProxy);
        var comment = new Comment();
        comment.setAuthor("Saghana Anthony");
        comment.setText("Demo comment");
        commentService.publishComment(comment);






    }



}