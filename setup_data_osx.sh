#!/bin/bash

function post {
curl -v \
 --header "Content-Type: application/json" \
 --header 'accept: application/json' \
 --header 'authorization: Basic YWRtaW46YWRtaW4=' \
 --header 'cache-control: no-cache' \
 -X POST -d @$1 \
 $2
}

post data/user-bob.json http://localhost:8080/tag/api/account
post data/user-password-bob.json http://localhost:8080/tag/api/account/bob
post data/user-alice.json http://localhost:8080/tag/api/account
post data/movie-client.json http://localhost:8080/tag/api/account
post data/api-movie-backend_osx.json http://localhost:8080/tag/api/http
# this is for the new app
# post data/api-ratings-app_osx.json http://localhost:8080/tag/api/http
post data/oauth2-profile-no-client.json http://localhost:8080/tag/api/profile/oauth2
post data/route-user-access.json http://localhost:8080/tag/api/route
# this is for the new app
# post data/route-ask-ratings.json http://localhost:8080/tag/api/route
# remove default p
curl -v \
 --header "Content-Type: application/json" \
 --header 'accept: application/json' \
 --header 'authorization: Basic YWRtaW46YWRtaW4=' \
 --header 'cache-control: no-cache' \
 http://localhost:8080/tag/api/profile/oauth2/oauth2-profile?migrateProfileId=oauth2-user-access-profile