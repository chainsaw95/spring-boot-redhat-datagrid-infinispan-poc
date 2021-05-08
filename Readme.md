## Sample Redhat-Jboss datagrid implementation


## Rnning the sample application

##### Starting the redhat jboss server

- Navigate to the redhat-datagrid-8.0.0-server directory bin folder
- Start server.sh or server.bat depending on your operating system

#### Run the Spring Boot Application



### API ENDPOINST

GET ALL USERS

- TYPE: GET
- URL: base_url/user

GET USER BY PAN

- TYPE: GET
- URL: base_url/user/{PANNO}

ADD USER
- TYPE: POST
- URL: base_url/user
- BODY:

```json
{
"pan": "IMAPQ80871",
"firstName": "Test Name",
"lastName": "Test Name"
}
```

Delete User:
- TYPE: Delete
- URL base_url/user/{PANNO}




