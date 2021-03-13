# service-testnet

Sends test transactions to the www.better-banking.io servers.

To run either:

* ./gradlew clean build && docker-compose up

or

* docker-compose up

### to test

`curl -X POST -H "Authorization: Basic YmV0dGVyLWJhbmtpbmc6N3lyYlI4WHBZNDViY0tQUA==" --data "grant_type=client_credentials" http://localhost:8080/oauth/token`

`curl -X GET -H "Authorization: Bearer <TOKEN>" "http://localhost:8080/accounts/123456/transactions" -H "accept: application/json"`
