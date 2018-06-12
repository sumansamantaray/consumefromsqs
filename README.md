# consumefromsqs
Spring boot application to consume messages from SQS

This application uses DefaultAWSCredentialsProviderChain to create AWSCredentialsProvider instance.
To use this approve please follow below set up
For Windows system ->
Create .aws folder under C:\Users\<UserName>\.aws
Create a file named "credentials" (without any file extension)
Add the below entries
[default]
aws_access_key_id=<Your Access Key ID>
aws_secret_access_key=<Your secret Access key>
  
  You can get the access key id and secret access key under your aws log in go to "My Security Credentials". If you have not created earlier, then you can create a new one.
