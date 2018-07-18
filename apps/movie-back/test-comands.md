




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
curl -s -v "http://localhost:8080/movie/movies" -H 'Accept: */*' -H "Authorization: Bearer eyJraWQiOiJvYXV0aDIta2V5cGFpciIsImN0eSI6Impzb24iLCJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJ0b2tlbi10eXBlIjoiYWNjZXNzLXRva2VuIiwibmJmIjoxNTMxOTUwMjIzLCJyb2xlcyI6WyJhZG1pbmlzdHJhdG9yIl0sIm5hbWUiOiJib2IiLCJpc3MiOiJcL29hdXRoMlwvdG9rZW4iLCJncm91cHMiOltdLCJ0YWctaW50ZXJuYWwiOnsiZ3JhbnQtdHlwZSI6InBhc3N3b3JkIiwicHJvZmlsZSI6Ik9BdXRoMiBQcm9maWxlIiwidmVyc2lvbiI6IjEuMCIsInVzZXJuYW1lIjoiYm9iIn0sImV4cCI6MTUzMTk1MjAyMywiaWF0IjoxNTMxOTUwMjIzLCJlbWFpbCI6ImJvYkBlbWFpbC5jb20iLCJqdGkiOiJlN2NlOTdiOGIwOWZmYzE2In0.Mt2ExTGdpAKRf4gCgILxv8Ni8xm6ocd_PcyUBJmP7aF_EUa50oE6pGPN23Ba_g-KRP2Hz3GLYytDcdkiRUaa5_cHkJ1wo9zsV7zJBBcUPGgnqHsDaqgNAWFnvJWRD5nHq76H7yEnjDn95hr8vgWiBpzBu1fbV-OOEUo8dw7Nn__I9sK-mDYir8_aWwMFZeP5QHeqjfvWvhOs455Swuzq45cMkBJTCbu23RX64vsoHggiIlsI-hkCWSNxFpCgQjaTR3qbGdl4ngqt4AVc-8Vuj3qARBExyq16RgnPnpA4pgjDrOBIWWJJHP600SxmAWU9tIwDlWK69CCKKprlZhRfeg" --compressed 
````