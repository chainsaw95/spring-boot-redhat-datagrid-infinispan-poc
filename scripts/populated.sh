
for i in {1..10000}
do
curl --request POST \
  --url http://localhost:9090/user \
  --header 'Content-Type: application/json' \
  --data "{
    \"pan\": \"IMAPQ80${i}\",
    \"firstName\": \"Test Name ${i}\",
    \"lastName\": \"Test Name ${i}\"
    }"

done