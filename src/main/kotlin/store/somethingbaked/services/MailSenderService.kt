package store.somethingbaked.services

import jakarta.mail.internet.MimeMessage
import org.springframework.mail.MailSendException
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.stereotype.Service
import store.somethingbaked.models.EmailDTO

@Service
class MailSenderService (
    private val emailSender: JavaMailSender
) {
    fun sendMail( emailMessage: EmailDTO){
        val message = createSimpleMessage(emailMessage);
        try {
            emailSender.send(message);
        } catch (e: Exception) {
            print(e.message);
            throw MailSendException("Failed to send email");
        }
    }

    private fun createSimpleMessage(emailMessage: EmailDTO) : MimeMessage {
        val message : MimeMessage = emailSender.createMimeMessage()
        val helper = MimeMessageHelper(message)

        helper.setTo(emailMessage.to)
        helper.setTo(emailMessage.subject)
        helper.setText(emailMessage.message)

        return message
    }
}