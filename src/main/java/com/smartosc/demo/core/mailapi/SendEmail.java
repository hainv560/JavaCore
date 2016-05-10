package com.smartosc.demo.core.mailapi;

import com.sun.xml.internal.ws.encoding.DataHandlerDataSource;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * Created by HaiNv on 08/05/2016.
 */
public class SendEmail {

    public static void main(String[] args) {

        final String email = "yourfromemail@gmail.com";
        final String password = "youremailpassword";
        final String subject = "Hey! You have new email";
        final String body = "Dear darling <br /> <br/> I already sent new email to you from my private email. Please reply me if you read this email. <br/> <br/> From your best friend";

        Properties props = new Properties();

        // Gmail via TLS
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");


        Session session = Session.getDefaultInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, password);
            }
        });


        try {
            MimeMessage message = new MimeMessage(session);
            InternetAddress addressFrom = new InternetAddress(email);

            // header part
            message.setFrom(addressFrom);

            InternetAddress addressTo = new InternetAddress(new String("testbongdaf@gmail.com"));

            message.setRecipient(Message.RecipientType.TO, addressTo);

            message.setSubject(subject);
            message.setSentDate(new Date());

            //body part
            MimeBodyPart bodyPart = new MimeBodyPart();
            bodyPart.setContent(body, "text/html;charset=utf-8");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(bodyPart);
            //attach part
            String[] filePath = {"D:/demo.jpg", "D:/crocodile.png"};

            if (filePath.length > 0) {
                for (String fileName : filePath) {
                    setAttach(fileName, multipart);
                }
            }
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("done");


        } catch (MessagingException e) {
            System.out.println("Error " + e);
        }catch (IOException e){
            System.out.println("Error " + e);
        }

    }

    private static void setAttach(String fileName, Multipart multipart) throws MessagingException,IOException {
        DataSource source = new FileDataSource(fileName);
        MimeBodyPart mimeBodyPart = new MimeBodyPart();

        mimeBodyPart.setDataHandler(new DataHandler(source));
        mimeBodyPart.setFileName(fileName);

        multipart.addBodyPart(mimeBodyPart);
    }
}
