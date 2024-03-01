package com.example.asmfinal.service.ipml;

import com.example.asmfinal.entity.MailInfo;
import com.example.asmfinal.service.MailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;

@Transactional
@Service
@RequiredArgsConstructor
public class MailServiceImpl   implements MailService {
    @Autowired
    JavaMailSender javaMailSender;
    @Override
    public int send(MailInfo mailInfo)  {
      try {
          MimeMessage mimeMessage=javaMailSender.createMimeMessage();
          MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(mimeMessage,true,"utf-8");
          mimeMessageHelper.setFrom(mailInfo.getFrom());
          mimeMessageHelper.setTo(mailInfo.getTo());
          mimeMessageHelper.setSubject(mailInfo.getSubject());
          mimeMessageHelper.setText(mailInfo.getBody(),true);
          mimeMessageHelper.setReplyTo(mailInfo.getFrom());
          String [] cc=mailInfo.getCc();
          if (cc!=null&&cc.length>0){
              mailInfo.setCc(cc);
          }
          String [] bcc=mailInfo.getBcc();
          if (bcc!=null&&bcc.length>0){
              mailInfo.setBcc(bcc);
          }
          String [] attachment=mailInfo.getAttachments();
          if (attachment!=null&&attachment.length>0){
              for (String path:attachment){
                  File file=new File(path);
                  mimeMessageHelper.addAttachment(file.getName(),file);
              }
          }
          javaMailSender.send(mimeMessage);
          return 1;
      }catch (MessagingException e){
          return 0;
      }

    }

    @Override
    public void send(String to, String subject, String body) throws MessagingException  {
        this.send(new MailInfo(to,subject,body));
    }
}
