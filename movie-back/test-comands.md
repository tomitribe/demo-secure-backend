




###Direct test to the APP endpoint (GET):
````
curl -i --insecure https://localhost:8443/movie/rest/movies
````
###Direct test to the APP endpoint (POST to add movies):
````
curl -X POST -i --insecure -b {-} https://localhost:8443/movie/rest/load
````
###Through the TAG
Authenicate as an existing user
````
curl -X POST http://localhost:8080/oauth2/token -H 'content-type: application/x-www-form-urlencoded'  -d 'grant_type=password&username=bob&password=12345678'
````
###Call endpoint through the TAG
````
curl -s -v "http://localhost:8080/movie/movies" -H 'Accept: */*' -H "Authorization: Bearer eyJraWQiOiJvYXV0aDIta2V5cGFpciIsImN0eSI6Impzb24iLCJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJ0b2tlbi10eXBlIjoiYWNjZXNzLXRva2VuIiwibmJmIjoxNTMxOTUyODIzLCJyb2xlcyI6WyJhZG1pbmlzdHJhdG9yIl0sIm5hbWUiOiJib2IiLCJpc3MiOiJcL29hdXRoMlwvdG9rZW4iLCJncm91cHMiOltdLCJ0YWctaW50ZXJuYWwiOnsiZ3JhbnQtdHlwZSI6InBhc3N3b3JkIiwicHJvZmlsZSI6Ik9BdXRoMiBQcm9maWxlIiwidmVyc2lvbiI6IjEuMCIsInVzZXJuYW1lIjoiYm9iIn0sImV4cCI6MTUzMTk1NDYyMywiaWF0IjoxNTMxOTUyODIzLCJlbWFpbCI6ImJvYkBlbWFpbC5jb20iLCJqdGkiOiI3MTRhNDk5ZjU4NTc1NWIwIn0.aznujeXE-FFetykvn9BfOhrUA5OoRXid7mj2VRLMWXoG6UTFMDbbAXACLoR_HCK_T74Ykbgk8gjzP3qZgg9bi7t80TMrCnqifDItT9L3D3uPRYe4SHTfjEPG3B83ll1b349KuBI1nVX_Vs3FXiFDXO8ZrKaJ9c3Fty5bBPWmAQrhofP7TmUxU64VVhhqdGJL2WkoVplyBIxW55grOfR5Cb1XHVEqTWYoWNoi_pz1l8L4Yd1mluFnRjQAQ0BMYq_vX55dSWvBbDzzBYT0T38eWetGj7aDH4HbrUur71XaohUJ3h87L5Gq16XS9MqHtY0EMimGeSZmZiab_t978GQTqQ" --compressed 
````