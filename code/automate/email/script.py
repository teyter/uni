import smtplib
sendandi = 'teg6@hi.is'
mottakandi = 'ass106@hi.is'
password = '9ijprR8p' # mogulegt security risk
subject = 'subject breyta'
smtpObj = smtplib.SMTP('smtp.office365.com', 587)
smtpObj.ehlo()
smtpObj.starttls()
smtpObj.login(sendandi, password)
smtpObj.sendmail(sendandi,mottakandi, 'Subject: assman\n\nsent ur python forriti')
{}
smtpObj.quit()
