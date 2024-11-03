# POST -- http://localhost:8081/api/users/register
# Request
{
"username": "TestUser",
"password": "password123",
"emailId": "abcd.efhg@gmail.com",
"role": "user",
"created_at": "2024-03-11"
}
# Response
{
"username": "TestUser",
"password": "password123",
"emailId": "abcd.efhg@gmail.com",
"role": "user",
"created_at": "2024-03-11"
}

# Get--http://localhost:8081/api/users/TestUser
# No Request

# Response
{
"id": "67271c8076228a729cd80c65",
"username": "TestUser",
"password": "password123",
"emailId": "abcd.efhg@gmail.com",
"role": "user",
"created_at": "2024-03-11T00:00:00.000+00:00"
}